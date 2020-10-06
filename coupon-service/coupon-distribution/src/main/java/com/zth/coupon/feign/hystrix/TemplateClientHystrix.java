package com.zth.coupon.feign.hystrix;

import com.zth.coupon.feign.TemplateClient;
import com.zth.coupon.vo.CommonResponse;
import com.zth.coupon.vo.CouponTemplateSDK;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.*;

/**
 * <h1>优惠券模板 Feign 接口的熔断降级策略</h1>
 *
 * @author 3zZ.
 * @date 2020/10/6.
 */
@Slf4j
@Component
public class TemplateClientHystrix implements TemplateClient {
    /**
     * <h2>查找所有可用的优惠券模板</h2>
     *
     * @return 所有可用的优惠券模板
     */
    @Override
    public CommonResponse<List<CouponTemplateSDK>> findAllUsableTemplate() {

        log.error("[eureka-client-coupon-template] findAllUsableTemplate " +
                "request error");

        return new CommonResponse<>(
                -1,
                "[eureka-client-coupon-template] request error",
                Collections.emptyList()
        );
    }

    /**
     * <h2>获取模板 ids 到 CouponTemplateSDK 的映射</h2>
     *
     * @param ids 所有的id列表
     * @return 返回map的映射
     */
    @Override
    public CommonResponse<Map<Integer, CouponTemplateSDK>> findIds2TemplateSDK(Collection<Integer> ids) {

        log.error("[eureka-client-coupon-template] findIds2TemplateSDK request error");

        return new CommonResponse<>(
                -1,
                "[eureka-client-coupon-template] request error",
                new HashMap<>(8)
        );
    }
}
