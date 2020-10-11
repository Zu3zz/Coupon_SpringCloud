package com.zth.coupon.feign;

import com.zth.coupon.exception.CouponException;
import com.zth.coupon.feign.hystrix.SettlementClientHystrix;
import com.zth.coupon.vo.CommonResponse;
import com.zth.coupon.vo.SettlementInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * <h1>优惠券结算微服务 Feign 接口定义</h1>
 *
 * @author 3zZ.
 * @date 2020/10/6.
 */
@FeignClient(value = "eureka-client-coupon-settlement",
        fallback = SettlementClientHystrix.class)
public interface SettlementClient {
    /**
     * <h2>优惠券规则计算</h2>
     *
     * @param settlementInfo 优惠券规则
     * @return 通用返回体
     * @throws CouponException
     */
    @RequestMapping(value = "/coupon-settlement/settlement/compute",
            method = RequestMethod.POST)
    CommonResponse<SettlementInfo> computeRule(@RequestBody SettlementInfo settlementInfo)
            throws CouponException;
}
