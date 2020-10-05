package com.zth.coupon.service.impl;

import com.zth.coupon.dao.CouponDao;
import com.zth.coupon.service.IKafkaService;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * <h2> kafka 相关的服务接口实现</h2>
 *
 * @author 3zZ.
 * @date 2020/10/5.
 */
@Slf4j
@Component
public class KafkaServiceImpl implements IKafkaService {
    /**
     * Coupon Dao
     */
    private final CouponDao couponDao;

    @Autowired
    public KafkaServiceImpl(CouponDao couponDao){
        this.couponDao = couponDao;
    }
    /**
     * <h2>消费优惠券 kafka 消息</h2>
     *
     * @param record {@link ConsumerRecord}
     */
    @Override
    public void consumeCouponKafkaMessage(ConsumerRecord<?, ?> record) {

    }
}
