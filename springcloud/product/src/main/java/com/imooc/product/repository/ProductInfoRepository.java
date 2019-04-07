package com.imooc.product.repository;

import com.imooc.product.dataObject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @ProjectName: product
 * @Package: com.imooc.product.repository
 * @ClassName: ProductInfoRepository
 * @Description: java类作用描述
 * @Author: teerus
 * @CreateDate: 2019-04-07 14:49
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo,String> {

    List<ProductInfo> findByProductStatus(Integer productStatus);

    List<ProductInfo> findByProductIdIn(List<String> productIdList);

}

