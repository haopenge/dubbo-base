package com.uu.husky;

import lombok.Data;

import java.io.Serializable;

/**
 * 描述：
 * User Liu PengHao
 * Date 2019/01/10 17:45
 **/
@Data
public class ResponseEntity implements Serializable {

    private static final long serialVersionUID = 2387272120606823964L;

    /**
     * 响应码
     */
    private String code;

    /**
     * 信息
     */
    private String message;

}
