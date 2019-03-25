package com.design.pattern.design_pattern.depend;

public class Test {
    public static void main(String[] args) {
        Zxy zxy=new Zxy();
        zxy.studyJavaCourse();
        zxy.studyFECourse();
        zxy.study(new JavaCourse());
        zxy.study(new FECourse());
    }
}
