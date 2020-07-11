package com.zth.coupon.service;

import com.zth.coupon.entity.CouponTemplate;

/**
 * @author 3zZ.
 * Date: 2020/7/11.
 * 异步服务接口定义
 */
public interface IAsyncService {
    /**
     * 根据模板异步的创建优惠券码
     *
     * @param couponTemplate {@link CouponTemplate} 优惠券模板实体
     */
    void asyncConstructCouponByTemplate(CouponTemplate couponTemplate);
}
