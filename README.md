## 使用SpringCloud开发电商优惠券

### 使用到的SpringCloud组件
- eureka：服务注册与发现
- spring-cloud-gateway: 网关
- zuul : 网关
```shell script
# 启动redis
> redis-server
> redis-cli
> cd ~/app/kafka_2.12-2.3.0
# 启动zookeeper 和 kafka
> bin/zookeeper-server-start.sh -daemon config/zookeeper.properties
> bin/kafka-server-start.sh config/server.properties 
```
- 在依次打开
  1. SettlementApplication
  2. DistributionApplication
  3. ZuulGatewayApplication
  4. EurekaApplication
  5. TemplateApplication