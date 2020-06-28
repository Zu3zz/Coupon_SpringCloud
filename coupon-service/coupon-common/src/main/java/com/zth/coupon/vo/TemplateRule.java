package com.zth.coupon.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 3zZ.
 * Date: 2020/6/28.
 * 优惠券规则对象定义
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TemplateRule {
    /**
     * 内部类: 有效期限规则
     */
    public static class Expiration {
        /**
         * 有效期规则 对应 PeriodType 的 code 字段
         */
        private Integer period;
        /**
         *
         */
        private Integer gap;
    }
}
