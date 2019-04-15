package com.imooc.product.VO;

import lombok.Data;

@Data
public class ResultVO<T> {

    /**
     * 错误码 正常为0
     */
    private Integer code;

    private String msg;

    private T data;

}

