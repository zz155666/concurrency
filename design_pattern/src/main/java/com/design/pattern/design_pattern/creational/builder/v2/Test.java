package com.design.pattern.design_pattern.creational.builder.v2;

public class Test {
    public static void main(String[] args) {
        Course course=new Course.CourseBuilder().buildCourseName("123").build();
        course.toString();
    }
}
