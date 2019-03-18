package com.design.pattern.design_pattern.openclose;

public class JavaDisCountCourse extends JavaCourse {

    public JavaDisCountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getOriginPrice(){
        return super.getPrice();
    }

    @Override
    public Double getPrice() {
        return super.getPrice()*0.8;
    }
}
