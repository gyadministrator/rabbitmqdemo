package com.fld.rabbitmq.demo.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

/**
 * @program: rabbitmqdemo
 * @description:
 * @author: fldserver
 * @create: 2019-12-24 09:18
 */
@Component
public class ApiPaymentReceive {
    private Logger logger = Logger.getLogger(this.getClass().getSimpleName());

    @RabbitHandler
    @RabbitListener(queues = "api.payment")
    public void order(String msg) {
        logger.info("api.payment.order receive message: " + msg);
    }
}