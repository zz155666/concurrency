package com.imooc.product.repository;

import com.imooc.product.dataObject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @ProjectName: product
 * @Package: com.imooc.product.repository
 * @ClassName: ProductInfoRepositoryTest
 * @Description: java类作用描述
 * @Author: teerus
 * @CreateDate: 2019-04-07 14:54
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {

    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Test
    public void findByProductStatus() throws Exception{
        List<ProductInfo> infoList=productInfoRepository.findByProductStatus(0);
        Assert.assertTrue(infoList.size()>0);
    }
}