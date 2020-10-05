package com.zth.coupon.service;

import org.apache.kafka.clients.consumer.ConsumerRecord;

/**
 * <h1>Kafka 相关的服务接口定义</h1>
 *
 * @author 3zZ.
 * @date 2020/10/5.
 */
public interface IKafkaService {

    /**
     * <h2>消费优惠券 kafka 消息</h2>
     *
     * @param record {@link ConsumerRecord}
     */
    void consumeCouponKafkaMessage(ConsumerRecord<?, ?> record);
}
