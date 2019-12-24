package com.fld.rabbitmq.demo;

import com.fld.rabbitmq.demo.sender.PaymentNotifySender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @program: rabbitmqdemo
 * @description:
 * @author: fldserver
 * @create: 2019-12-18 11:45
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PaymentNotifySenderTest {
    @Autowired
    private PaymentNotifySender paymentNotifySender;

    @Test
    public void test_sender() {
        paymentNotifySender.sender("支付订单号：" + System.currentTimeMillis());
    }
}