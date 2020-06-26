package com.zth.coupon.filter;

import com.google.common.util.concurrent.RateLimiter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import rx.annotations.Beta;

import javax.servlet.http.HttpServletRequest;

/**
 * Date: 2020/6/26 11:25 下午
 * 限流过滤器
 *
 * @author 3zZ.
 */
@Slf4j
@Component
public class RateLimiterFilter extends AbstractPreZuulFilter {
    /**
     * 每秒可以获得到两个令牌
     */
    RateLimiter rateLimiter = RateLimiter.create(2.0);

    @Override
    protected Object cRun() {
        HttpServletRequest request = context.getRequest();
        if (rateLimiter.tryAcquire()) {
            log.info("get rate token success");
            return success();
        } else {
            log.error("rate limit: {}", request.getRequestURI());
            return fail(402, "error: rate limit");
        }
    }

    @Override
    public int filterOrder() {
        return 0;
    }
}
