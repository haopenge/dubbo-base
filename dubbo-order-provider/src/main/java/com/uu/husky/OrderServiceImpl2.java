package com.uu.husky;

/**
 * 描述：
 * User Liu PengHao
 * Date 2019/01/18 09:43
 **/
public class OrderServiceImpl2 implements IOrderService {
    public ResponseEntity doOrder(RequestEntity requestEntity) {

        String name = requestEntity.getName();
        System.out.println(name + "。。。。曾经来过。。。。。>>版本2");

        ResponseEntity responseEntity = new ResponseEntity();
        responseEntity.setCode(">>200");
        responseEntity.setMessage(name + "处理了>>版本2");
        return responseEntity;
    }
}
