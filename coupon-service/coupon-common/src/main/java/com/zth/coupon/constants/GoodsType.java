package com.zth.coupon.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Objects;
import java.util.stream.Stream;

/**
 * <h1>商品类型枚举</h1>
 *
 * @author 3zZ.
 * @date 2020/10/5.
 */
@Getter
@AllArgsConstructor
public enum GoodsType {
    /**
     * 文娱
     */
    WENYU("文娱", 1),

    /**
     * 生鲜
     */
    SHENGXIAN("生鲜", 2),

    /**
     * 家居
     */
    JIAJU("家居 ", 3),

    /**
     *
     */
    OTHERS("其他", 4),

    /**
     * 全品类
     */
    ALL("全体类", 5);
    /**
     * 商品类型描述
     */
    private String description;
    /**
     * 商品类型编码
     */
    private Integer code;

    public static GoodsType of(Integer code) {
        Objects.requireNonNull(code);
        return Stream.of(values())
                .filter(bean -> bean.code.equals(code)).findAny()
                .orElseThrow(() -> new IllegalArgumentException(code + "not exists!"));
    }
}
