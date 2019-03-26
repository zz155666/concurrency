package com.design.pattern.design_pattern.creational.abstractfactory;

public class Test {
    public static void main(String[] args) {
        CourseFactory courseFactory=new JavaCourceFactory();
        Video video=courseFactory.getVideo();
        Article article=courseFactory.getArticle();
        video.produce();
        article.produce();
        ((JavaVideo)video).dof();
    }
}
