package com.fld.rabbitmq.demo.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

/**
 * @program: rabbitmqdemo
 * @description:
 * @author: fldserver
 * @create: 2019-12-24 09:17
 */
@Component
public class ApiCoreReceive {
    private Logger logger = Logger.getLogger(this.getClass().getSimpleName());

    @RabbitHandler
    @RabbitListener(queues = "api.core")
    public void user(String msg) {
        logger.info("api.core receive message: " + msg);
    }
}