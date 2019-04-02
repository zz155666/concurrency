package com.design.pattern.design_pattern.structural.decorator;

public class AbstractDecorator extends ABattercake {
    private ABattercake aBattercake;

    AbstractDecorator(ABattercake aBattercake){
        this.aBattercake=aBattercake;
    }

    @Override
    protected String getDesc() {
        return this.aBattercake.getDesc();
    }

    @Override
    protected int cost() {
        return this.aBattercake.cost();
    }
}
