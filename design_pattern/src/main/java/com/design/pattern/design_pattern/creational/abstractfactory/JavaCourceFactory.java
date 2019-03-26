package com.design.pattern.design_pattern.creational.abstractfactory;

public class JavaCourceFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
