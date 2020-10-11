package com.zth.coupon.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <h1>商品信息</h1>
 *
 * @author 3zZ.
 * @date 2020/10/5.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GoodsInfo {
    /**
     * 商品类型 {@link com.zth.coupon.constants.GoodsType}
     */
    private Integer type;
    /**
     * 商品价格
     */
    private Double price;
    /**
     * 商品数量
     */
    private Integer count;
    // todo 商品名称，使用信息等
}
