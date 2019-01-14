package com.uu.husky;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 描述：
 * User Liu PengHao
 * Date 2019/01/10 18:53
 **/
public class ConsumerApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("order-consumer.xml");
        IOrderService orderService = context.getBean(IOrderService.class);

        RequestEntity requestEntity = new RequestEntity();
        requestEntity.setName("小猫咪 喵喵喵");
        ResponseEntity responseEntity = orderService.doOrder(requestEntity);
        System.out.println("消费者：" + responseEntity.toString());
    }
}
