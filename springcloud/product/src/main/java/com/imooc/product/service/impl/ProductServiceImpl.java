package com.imooc.product.service.impl;

import com.imooc.product.dataObject.ProductInfo;
import com.imooc.product.enums.ProductStatusEnum;
import com.imooc.product.repository.ProductInfoRepository;
import com.imooc.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName: product
 * @Package: com.imooc.product.service.impl
 * @ClassName: ProductServiceImpl
 * @Description: java类作用描述
 * @Author: teerus
 * @CreateDate: 2019-04-10 23:12
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Override
    public List<ProductInfo> findUpAll() {
        return productInfoRepository.findByProductStatus(ProductStatusEnum.UP.getCode());
    }
}
