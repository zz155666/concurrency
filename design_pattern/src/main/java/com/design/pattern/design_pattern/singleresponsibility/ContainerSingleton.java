package com.design.pattern.design_pattern.singleresponsibility;


import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

public class ContainerSingleton {
    private static Map<String,Object> singtonMap=new HashMap<>();

    public static void putInstance(String key,Object instance){
        if(!StringUtils.isEmpty(key)&&instance!=null){

        }
    }
}
