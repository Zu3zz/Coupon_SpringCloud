package com.zth.coupon.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * <h1>规则类型枚举定义</h1>
 *
 * @author 3zZ.
 * @date 2020/10/11.
 */
@Getter
@AllArgsConstructor
public enum RuleFlag {
    // 单类别优惠券定义

    /**
     * 满减券
     */
    MANJIAN("满减券的计算规则"),
    /**
     * 折扣券
     */
    ZHEKOU("折扣券的计算规则"),
    /**
     * 立减券
     */
    LIJIAN("立减券的计算规则"),

    // 多类别优惠券定义
    MANJIAN_ZHEKOU("满减券 + 折扣券的计算规则");

    // TODO 更多优惠券类别的组合

    /**
     * 规则描述
     */
    private String description;
}
