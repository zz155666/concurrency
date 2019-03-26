package com.design.pattern.design_pattern.creational.builder.v2;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Course {
    private String courseName;

    public Course(CourseBuilder courseBuilder){
        this.courseName=courseBuilder.courseName;
    }

    @Override
    public String toString() {
        String result= "courseName='" + courseName;
        log.info(result);
        return result;
    }

    public static class CourseBuilder{
        private String courseName;

        public CourseBuilder buildCourseName(String courseName){
            this.courseName=courseName;
            return this;
        }

        public Course build(){
            return new Course(this);
        }

    }
}
