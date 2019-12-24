package com.fld.rabbitmq.demo.sender;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

/**
 * @program: rabbitmqdemo
 * @description:
 * @author: fldserver
 * @create: 2019-12-18 11:42
 */
@Component
public class PaymentNotifySender {
    private Logger logger = Logger.getLogger(this.getClass().getSimpleName());
    @Autowired
    private AmqpTemplate amqpTemplate;

    public void sender(String msg) {
        logger.info("notify.payment send message: " + msg);
        amqpTemplate.convertAndSend("notify.payment", msg);
    }
}