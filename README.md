# spring-cloud-stream-learn
#### spring-cloud-stream 学习
  * 参考地址： https://springcloud.cc/spring-cloud-dalston.html#_spring_cloud_stream
  * https://www.aliyun.com/jiaocheng/802567.html
### 操作步骤
  * 1:启动本地 zk  和 kafka服务
  * 2:启动SourceUserApplication boot服务
  * 3:启动SinkUserApplication boot服务
  * 4:cloud-stream-source-user服务:(trigger.cron)定时器 每分钟执行一次，
      操作(swl-msm)数据库，执行(jdbc.query)sql语句
      把数据写入到(stream_user_topic)输出通道
  * 5:cloud-stream-sink-user服务:通过输入通道(@StreamListener(Sink.INPUT))
      获取source服务写入的数据，之后进行其他操作,,,
