package com.zth.coupon.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Objects;
import java.util.stream.Stream;

/**
 * @author 3zZ.
 * Date: 2020/6/28.
 * 产品线枚举
 */
@Getter
@AllArgsConstructor
public enum ProductLine {
    /**
     * 大猫产品线
     */
    BIG_CAT("大猫", 1),
    /**
     * 大狗产品线 随便乱写的
     */
    BIG_DOG("大狗", 2);
    /**
     * 产品线描述
     */
    private String description;
    /**
     * 产品线编码
     */
    private Integer code;

    public static ProductLine of(Integer code) {
        Objects.requireNonNull(code);
        return Stream.of(values())
                .filter(bean -> bean.code.equals(code)).findAny()
                .orElseThrow(() -> new IllegalArgumentException(code + "not exists!"));
    }

}
