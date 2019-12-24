package com.fld.rabbitmq.demo.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

/**
 * @program: rabbitmqdemo
 * @description:
 * @author: fldserver
 * @create: 2019-12-18 11:39
 */
@Component
@RabbitListener(queues = "notify.payment")
public class PaymentNotifyReceiver {
    private Logger logger = Logger.getLogger(this.getClass().getSimpleName());

    @RabbitHandler
    public void receive(String msg) {
        logger.info("notify.payment receive message: " + msg);
    }
}