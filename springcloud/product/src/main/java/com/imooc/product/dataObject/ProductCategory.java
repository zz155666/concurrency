package com.imooc.product.dataObject;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * @ProjectName: product
 * @Package: com.imooc.product
 * @ClassName: ProductCategory
 * @Description: java类作用描述
 * @Author: teerus
 * @CreateDate: 2019-04-07 14:37
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Data
@Entity
public class ProductCategory {

    @Id
    @GeneratedValue
    private Integer categoryId;

    /** 类目名字. */
    private String categoryName;

    /** 类目编号. */
    private Integer categoryType;

    private Date createTime;

    private Date updateTime;

}
