package com.uu.husky;

/**
 * 描述：
 * User Liu PengHao
 * Date 2019/01/10 17:56
 **/
public class OrderServiceImpl implements IOrderService {
    public ResponseEntity doOrder(RequestEntity requestEntity) {

        String name = requestEntity.getName();
        System.out.println(name + "。。。。曾经来过。。。。。");

        ResponseEntity responseEntity = new ResponseEntity();
        responseEntity.setCode("200");
        responseEntity.setMessage(name + "处理了");
        return responseEntity;
    }
}
