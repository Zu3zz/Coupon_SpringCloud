package com.zth.coupon.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * Date: 2020/6/27 12:19 上午
 *
 * @author 3zZ.
 */
@Slf4j
@Component
public class AccessLogFilter extends AbstractPostZuulFilter {
    @Override
    protected Object cRun() {
        HttpServletRequest request = context.getRequest();
        // 从 PreRequestFilter中获取设置的请求时间戳
        Long startTime = (Long) context.get("startTime");
        String uri = request.getRequestURI();
        long duration = System.currentTimeMillis() - startTime;
        // 从网关通过的请求都会打印记录: uri + duration
        log.info("uri: {}, duration: {} ", uri, duration);
        return success();
    }

    @Override
    public int filterOrder() {
        return FilterConstants.SEND_RESPONSE_FILTER_ORDER;
    }
}
