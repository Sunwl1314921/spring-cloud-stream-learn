package com.cloud.stream.sink.user.listener;


import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.util.LinkedCaseInsensitiveMap;

/**
 * user消息消费
 *
 */
@EnableBinding(Sink.class)
public class ItemListener {


    @StreamListener(Sink.INPUT)
    public void log(LinkedCaseInsensitiveMap payload) {
        System.out.println(payload);
        System.out.println("这里可以操作插入aws数据库");

    }
}
