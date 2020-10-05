package com.zth.coupon.dao;

import com.zth.coupon.constant.CouponStatus;
import com.zth.coupon.entity.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * <h1>Coupon Dao 接口定义</h1>
 *
 * @author 3zZ.
 * @date 2020/10/5.
 */
public interface CouponDao extends JpaRepository<Coupon, Integer> {

    /**
     * 根据 userId + 状态寻找优惠券记录
     * where userId = ... and status = ...
     *
     * @param userId 用户id
     * @param status 用户状态
     * @return 所有该用户的优惠券
     */
    List<Coupon> findAllByUserIdAndStatus(Long userId, CouponStatus status);
}
