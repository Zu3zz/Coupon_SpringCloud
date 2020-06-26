package com.zth.coupon.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * Date: 2020/6/27 12:06 上午
 *
 * @author 3zZ.
 */
@Slf4j
@Component
public class PreRequestFilter extends AbstractPreZuulFilter {
    @Override
    protected Object cRun() {
        context.set("startTime", System.currentTimeMillis());
        return success();
    }

    @Override
    public int filterOrder() {
        return 0;
    }
}
