package com.zth.coupon.conf;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;

/**
 * Date: 2020/6/27 1:24 上午
 * jackson 的自定义配置
 *
 * @author 3zZ.
 */
@Configuration
public class JacksonConfig {
    @Bean
    public ObjectMapper getObjectMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.setDateFormat(new SimpleDateFormat(
                "yyyy-MM-dd HH:mm:ss"
        ));
        return mapper;
    }
}
