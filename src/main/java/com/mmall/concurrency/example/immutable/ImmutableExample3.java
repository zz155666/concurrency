package com.mmall.concurrency.example.immutable;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
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
public class ImmutableExample3 {

    private final static  ImmutableList list=ImmutableList.of(1,2,3,4,5);

    private final static ImmutableSet set=ImmutableSet.copyOf(list);

    private final static ImmutableMap<Integer,Integer> map1=ImmutableMap.of(1,2,3,4);

    private final static ImmutableMap<Integer,Integer> map2=ImmutableMap.<Integer,Integer>builder().
            put(1,2).put(3,4).put(5,6).build();


    public static void main(String[] args) {
        list.add(8);
    }

    public void exa(final int a){
        //a=2;
    }

}
