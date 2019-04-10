package com.imooc.product.service;

import com.imooc.product.dataObject.ProductInfo;

import java.util.List;

/**
 * @ProjectName: product
 * @Package: com.imooc.product.service
 * @ClassName: ProductService
 * @Description: java类作用描述
 * @Author: teerus
 * @CreateDate: 2019-04-10 22:49
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public interface ProductService {
    List<ProductInfo> findUpAll();
}
