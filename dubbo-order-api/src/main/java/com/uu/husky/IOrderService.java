package com.uu.husky;

/**
 * 描述：
 * User Liu PengHao
 * Date 2019/01/10 17:43
 **/
public interface IOrderService {

    /**
     * 下单
     */
    ResponseEntity doOrder(RequestEntity requestEntity);
}
