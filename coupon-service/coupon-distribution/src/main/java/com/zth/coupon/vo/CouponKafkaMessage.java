package com.zth.coupon.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * <h1>优惠券 kafka 消息对象定义</h1>
 *
 * @author 3zZ.
 * @date 2020/10/4.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CouponKafkaMessage {
    /**
     * 优惠券状态
     */
    private Integer status;
    /**
     * Coupon 主键
     */
    private List<Integer> ids;
}
