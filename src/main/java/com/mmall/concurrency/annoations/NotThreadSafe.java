package com.mmall.concurrency.annoations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @ProjectName: concurrency
 * @Package: com.mmall.concurrency.annoations
 * @ClassName: NotThreadSafe
 * @Description: 课程里用来表示【线程不安全】的类或者是写法
 * @Author: teerus
 * @CreateDate: 2019-02-23 13:50
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
public @interface NotThreadSafe {
    String value() default "";
}

