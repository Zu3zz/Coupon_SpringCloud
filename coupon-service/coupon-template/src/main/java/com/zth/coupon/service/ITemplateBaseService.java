package com.zth.coupon.service;

import com.zth.coupon.entity.CouponTemplate;
import com.zth.coupon.exception.CouponException;
import com.zth.coupon.vo.CouponTemplateSDK;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * @author 3zZ.
 * Date: 2020/7/11.
 * 优惠券模板基础(view, delete ...) 服务定义
 */
public interface ITemplateBaseService {
    /**
     * 根据优惠券模板id获取优惠券模板信息
     *
     * @param id 模板id
     * @return {@link CouponTemplate} 返回优惠券实体类模板
     * @throws CouponException 优惠券通用异常
     */
    CouponTemplate buildTemplateInfo(Integer id) throws CouponException;

    /**
     * 查找所有可用的优惠券模板
     *
     * @return {@link CouponTemplateSDK}s
     */
    List<CouponTemplateSDK> findAllUsableTemplate();

    /**
     * 获取模板 ids 到 CouponTemplateSDK 的映射
     *
     * @param ids 模板 ids
     * @return Map<key: 模板 id ， value: CouponTemplateSDK>
     */
    Map<Integer, CouponTemplateSDK> findIds2TemplateSDK(Collection<Integer> ids);
}
