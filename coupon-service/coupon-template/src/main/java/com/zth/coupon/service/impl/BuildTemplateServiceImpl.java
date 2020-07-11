package com.zth.coupon.service.impl;

import com.zth.coupon.dao.CouponTemplateDao;
import com.zth.coupon.entity.CouponTemplate;
import com.zth.coupon.exception.CouponException;
import com.zth.coupon.service.IAsyncService;
import com.zth.coupon.service.IBuildTemplateService;
import com.zth.coupon.vo.TemplateRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 3zZ.
 * Date: 2020/7/11.
 * 构建优惠券模板实现
 */
@Slf4j
@Service
public class BuildTemplateServiceImpl implements IBuildTemplateService {
    /**
     * 异步服务
     */
    private final IAsyncService asyncService;
    private final CouponTemplateDao templateDao;

    @Autowired
    public BuildTemplateServiceImpl(IAsyncService iAsyncService, CouponTemplateDao couponTemplateDao) {
        this.asyncService = iAsyncService;
        this.templateDao = couponTemplateDao;
    }

    /**
     * 创建优惠券模板
     *
     * @param request {@link TemplateRequest} 优惠券模板请求对象
     * @return {@link CouponTemplate} 优惠券模板实体
     * @throws CouponException 优惠券通用异常
     */
    @Override
    public CouponTemplate buildTemplate(TemplateRequest request) throws CouponException {
        // 参数合法性校验
        if (!request.validate()) {
            throw new CouponException("BuildTemplate Param Is Not Valid!");
        }

        // 判断同名的优惠券模板是否存在
        if (null != templateDao.findByName(request.getName())) {
            throw new CouponException("Exist Same Name Template!");
        }

        // 构造 CouponTemplate 并保存到数据库中
        CouponTemplate template = requestToTemplate(request);
        template = templateDao.save(template);

        // 根据优惠券模板异步生成优惠券码
        asyncService.asyncConstructCouponByTemplate(template);

        return template;
    }

    /**
     * 将 TemplateRequest转换为 template
     *
     * @param request 模板请求
     * @return 创建的优惠券模板
     */
    private CouponTemplate requestToTemplate(TemplateRequest request) {
        return new CouponTemplate(
                request.getName(),
                request.getLogo(),
                request.getDesc(),
                request.getCategory(),
                request.getProductLine(),
                request.getCount(),
                request.getUserId(),
                request.getTarget(),
                request.getRule()
        );
    }
}
