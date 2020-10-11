package com.zth.coupon.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Objects;
import java.util.stream.Stream;

/**
 * @author 3zZ.
 * Date: 2020/6/28.
 */
@Getter
@AllArgsConstructor
public enum CouponCategory {
    /**
     * 满减券
     */
    MANJIAN("满减", "001"),
    /**
     * 折扣券
     */
    ZHEKOU("折扣券", "002"),
    /**
     * 立减券
     */
    LIJIAN("立减券", "003");

    /**
     * 优惠券描述(分类)
     */
    private String description;
    /**
     * 优惠券分类编码
     */
    private String code;

    public static CouponCategory of(String code) {
        Objects.requireNonNull(code);
        return Stream.of(values())
                .filter(bean -> bean.code.equals(code)).findAny()
                .orElseThrow(() -> new IllegalArgumentException(code + "not exists!"));
    }
}
