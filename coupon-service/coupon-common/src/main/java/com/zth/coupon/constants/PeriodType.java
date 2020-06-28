package com.zth.coupon.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Objects;
import java.util.stream.Stream;

/**
 * @author 3zZ.
 * Date: 2020/6/28.
 * 有效期类型枚举
 */
@Getter
@AllArgsConstructor
public enum PeriodType {
    /**
     * 固定日期
     */
    REGULAR("固定的", 1),
    /**
     * 以领取之日开始计算
     */
    SHIFT("变动的", 2);
    /**
     * 有效期描述
     */
    private String description;
    /**
     * 有效期编码
     */
    private Integer code;

    public static PeriodType of(String code) {
        Objects.requireNonNull(code);
        return Stream.of(values())
                .filter(bean -> bean.code.equals(code)).findAny()
                .orElseThrow(() -> new IllegalArgumentException(code + "not exists!"));
    }
}
