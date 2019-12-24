package com.fld.rabbitmq.demo.sender;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

/**
 * @program: rabbitmqdemo
 * @description:
 * @author: fldserver
 * @create: 2019-12-24 09:20
 */
@Component
public class ApiPaymentSender {
    private Logger logger = Logger.getLogger(this.getClass().getSimpleName());
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void order(String msg) {
        logger.info("api.payment.order send message: " + msg);
        rabbitTemplate.convertAndSend("paymentExchange", "api.payment.order", msg);
    }

    public void orderQuery(String msg) {
        logger.info("api.payment.order.query send message: " + msg);
        rabbitTemplate.convertAndSend("paymentExchange", "api.payment.order.query", msg);
    }

    public void orderDetailQuery(String msg) {
        logger.info("api.payment.order.detail.query send message: " + msg);
        rabbitTemplate.convertAndSend("paymentExchange", "api.payment.order.detail.query", msg);
    }
}