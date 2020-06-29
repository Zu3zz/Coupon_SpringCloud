package com.zth.coupon.converter;

import com.alibaba.fastjson.JSON;
import com.zth.coupon.vo.TemplateRule;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

/**
 * @author 3zZ.
 * Date: 2020/6/29.
 */
@Converter
public class RuleConverter implements AttributeConverter<TemplateRule, String> {

    @Override
    public String convertToDatabaseColumn(TemplateRule templateRule) {
        return JSON.toJSONString(templateRule);
    }

    @Override
    public TemplateRule convertToEntityAttribute(String templateRule) {
        return JSON.parseObject(templateRule, TemplateRule.class);
    }
}
