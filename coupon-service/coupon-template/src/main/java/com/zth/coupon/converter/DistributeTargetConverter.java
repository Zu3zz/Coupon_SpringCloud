package com.zth.coupon.converter;

import com.alibaba.fastjson.JSON;
import com.zth.coupon.constants.DistributeTarget;

import javax.persistence.AttributeConverter;

/**
 * @author 3zZ.
 * Date: 2020/6/29.
 */
public class DistributeTargetConverter implements AttributeConverter<DistributeTarget, String> {
    @Override
    public String convertToDatabaseColumn(DistributeTarget distributeTarget) {
        return JSON.toJSONString(distributeTarget);
    }

    @Override
    public DistributeTarget convertToEntityAttribute(String s) {
        return null;
    }
}
