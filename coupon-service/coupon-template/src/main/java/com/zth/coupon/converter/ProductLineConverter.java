package com.zth.coupon.converter;

import com.zth.coupon.constants.ProductLine;

import javax.persistence.AttributeConverter;

/**
 * @author 3zZ.
 * Date: 2020/6/29.
 */
public class ProductLineConverter implements AttributeConverter<ProductLine, Integer> {
    @Override
    public Integer convertToDatabaseColumn(ProductLine productLine) {
        return productLine.getCode();
    }

    @Override
    public ProductLine convertToEntityAttribute(Integer code) {
        return ProductLine.of(code);
    }
}
