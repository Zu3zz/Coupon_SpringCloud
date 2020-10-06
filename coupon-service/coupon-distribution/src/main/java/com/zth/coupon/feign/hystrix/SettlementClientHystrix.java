package com.zth.coupon.feign.hystrix;

import com.zth.coupon.exception.CouponException;
import com.zth.coupon.feign.SettlementClient;
import com.zth.coupon.vo.CommonResponse;
import com.zth.coupon.vo.SettlementInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * <h1>结算微服务熔断策略实现</h1>
 *
 * @author 3zZ.
 * @date 2020/10/6.
 */
@Slf4j
@Component
public class SettlementClientHystrix implements SettlementClient {
    /**
     * <h2>优惠券规则计算</h2>
     *
     * @param settlementInfo 优惠券规则 {@link SettlementInfo}
     * @return 通用返回体
     * @throws CouponException
     */
    @Override
    public CommonResponse<SettlementInfo> computeRule(SettlementInfo settlementInfo) throws CouponException {
        log.error("[eureka-client-coupon-settlement] computeRule" +
                "request error");

        settlementInfo.setEmploy(false);
        settlementInfo.setCost(-1.0);

        return new CommonResponse<>(
                -1,
                "[eureka-client-coupon-settlement] request error",
                settlementInfo
        );
    }
}
