package com.imooc.product.enums;

import lombok.Getter;

/**
 * @ProjectName: product
 * @Package: com.imooc.product.enums
 * @ClassName: ProductStatusEnum
 * @Description: java类作用描述
 * @Author: teerus
 * @CreateDate: 2019-04-10 23:14
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Getter
public enum ProductStatusEnum {
    UP(0,"在架"),
    DOWN(1,"下架"),
    ;

    private Integer code;
    private String meaasge;

    ProductStatusEnum(Integer code, String meaasge) {
        this.code = code;
        this.meaasge = meaasge;
    }
}
