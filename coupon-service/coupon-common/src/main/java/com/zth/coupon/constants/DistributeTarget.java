package com.zth.coupon.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Objects;
import java.util.stream.Stream;

/**
 * @author 3zZ.
 * Date: 2020/6/28.
 * 分发目标
 */
@Getter
@AllArgsConstructor
public enum DistributeTarget {
    /**
     * 单用户
     */
    SINGLE("单用户", 1),
    /**
     * 多用户
     */
    MULTI("多用户", 2);
    /**
     * 分发目标描述
     */
    private String description;
    /**
     * 分发目标编码
     */
    private Integer code;

    public static DistributeTarget of(String code) {
        Objects.requireNonNull(code);
        return Stream.of(values())
                .filter(bean -> bean.code.equals(code)).findAny()
                .orElseThrow(() -> new IllegalArgumentException(code + "not exists!"));
    }
}
