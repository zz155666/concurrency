package com.design.pattern.design_pattern.structural.decorator;

public class BatterCake extends ABattercake {
    @Override
    protected String getDesc() {
        return "煎饼";
    }

    @Override
    protected int cost() {
        return 6;
    }
}
