package com.zth.coupon.service;

import com.zth.coupon.entity.CouponTemplate;
import com.zth.coupon.exception.CouponException;
import com.zth.coupon.vo.TemplateRequest;

/**
 * @author 3zZ.
 * Date: 2020/7/11.
 * 构建优惠券模板定义
 */
public interface IBuildTemplateService {
    /**
     * 创建优惠券模板
     *
     * @param request {@link TemplateRequest} 优惠券模板请求对象
     * @return {@link CouponTemplate} 优惠券模板实体
     * @throws CouponException 优惠券通用异常
     */
    CouponTemplate buildTemplate(TemplateRequest request) throws CouponException;
}
