package com.fld.rabbitmq.demo.sender;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

/**
 * @program: rabbitmqdemo
 * @description:
 * @author: fldserver
 * @create: 2019-12-24 09:19
 */
@Component
public class ApiCoreSender {
    private Logger logger = Logger.getLogger(this.getClass().getSimpleName());
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void user(String msg) {
        logger.info("api.core.user send message: " + msg);
        rabbitTemplate.convertAndSend("coreExchange", "api.core.user", msg);
    }

    public void userQuery(String msg) {
        logger.info("api.core.user.query send message: " + msg);
        rabbitTemplate.convertAndSend("coreExchange", "api.core.user.query", msg);
    }
}