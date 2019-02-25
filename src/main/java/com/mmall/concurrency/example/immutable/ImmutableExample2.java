package com.mmall.concurrency.example.immutable;

import com.google.common.collect.Maps;

import java.util.Collections;
import java.util.Map;

/**
 * @ProjectName: concurrency
 * @Package: com.mmall.concurrency.example.immutable
 * @ClassName: ImmutableExample1
 * @Description: java类作用描述
 * @Author: teerus
 * @CreateDate: 2019-02-25 22:51
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class ImmutableExample2 {

    private final static Integer a=1;
    private final static String b="1";
    private  static Map<Integer,Integer> map= Maps.newHashMap();

    static {
        map.put(1,2);
        map.put(3,4);
        map.put(5,6);
        map= Collections.unmodifiableMap(map);
    }

    public static void main(String[] args) {
        map.put(7,8);
    }

    public void exa(final int a){
        //a=2;
    }

}
