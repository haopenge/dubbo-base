package com.uu.husky;

import lombok.Data;

import java.io.Serializable;

/**
 * 描述：
 * User Liu PengHao
 * Date 2019/01/10 17:52
 **/
@Data
public class RequestEntity implements Serializable {

    private static final long serialVersionUID = -3324764447779070293L;

    /**
     * 名称
     */
    private String name;
}
