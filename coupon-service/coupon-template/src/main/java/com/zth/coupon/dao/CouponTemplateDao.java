package com.zth.coupon.dao;

import com.zth.coupon.entity.CouponTemplate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author 3zZ.
 * Date: 2020/6/30.
 */
public interface CouponTemplateDao extends JpaRepository<CouponTemplate, String> {
    /**
     * 通过名字查找相应的优惠券模板
     * where name = ...
     *
     * @param name 优惠券名称
     * @return 相应的优惠券模板
     */
    CouponTemplate findByName(String name);

    /**
     * 通过 available 和 expired 标记查找模板记录
     * where available = ... and expired = ...List
     *
     * @param available 当前可用的
     * @param expired   过期的
     * @return 返回所有满足条件的优惠券模板
     */
    List<CouponTemplate> findAllByAvailableAndExpired(Boolean available, Boolean expired);

    /**
     * 通过expired标记查找模板记录
     * where expired = ...
     *
     * @param expired 已经过期的
     * @return 返回所有满足条件的优惠券模板
     */
    List<CouponTemplate> findAllByExpired(Boolean expired);

}
