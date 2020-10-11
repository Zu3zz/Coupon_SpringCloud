package com.zth.coupon.converter;

import com.zth.coupon.constants.CouponCategory;

import javax.persistence.AttributeConverter;

/**
 * @author 3zZ.
 * Date: 2020/6/29.
 * <p>
 * 优惠券分类枚举属性转换器
 * AttributeConverter<X, Y>
 * X: 是实体属性的类型
 * Y: 是数据库字段的类型
 */
public class CouponCategoryConverter implements AttributeConverter<CouponCategory, String> {
    /**
     * 将实体属性X转换为Y存储到数据库中, 插入和更新时执行的动作
     *
     * @param couponCategory 需要被转化的传入的对象
     * @return 返回被转换为的string
     */
    @Override
    public String convertToDatabaseColumn(CouponCategory couponCategory) {
        return couponCategory.getCode();
    }

    @Override
    public CouponCategory convertToEntityAttribute(String code) {
        return CouponCategory.of(code);
    }
}
