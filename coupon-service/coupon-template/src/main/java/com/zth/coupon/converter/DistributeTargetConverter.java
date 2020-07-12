package com.zth.coupon.converter;

import com.alibaba.fastjson.JSON;
import com.zth.coupon.constants.DistributeTarget;

import javax.persistence.AttributeConverter;

/**
 * @author 3zZ.
 * Date: 2020/6/29.
 */
public class DistributeTargetConverter implements AttributeConverter<DistributeTarget, Integer> {
    @Override
    public Integer convertToDatabaseColumn(DistributeTarget distributeTarget) {
        return distributeTarget.getCode();
    }

    @Override
    public DistributeTarget convertToEntityAttribute(Integer code) {
        return DistributeTarget.of(code);
    }
}
