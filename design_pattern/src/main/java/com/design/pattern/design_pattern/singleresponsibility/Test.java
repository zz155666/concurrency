package com.design.pattern.design_pattern.singleresponsibility;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class objectClass=EnumInstance.class;
        Constructor constructor=objectClass.getDeclaredConstructor(String.class,int.class);
        constructor.setAccessible(true);
        EnumInstance enumInstance=(EnumInstance)constructor.newInstance("123",123);
    }
}
