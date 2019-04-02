package com.design.pattern.design_pattern.structural.decorator;

public class EggAbstract extends AbstractDecorator {
    public EggAbstract(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc()+ "加一个鸡蛋";
    }

    @Override
    protected int cost() {
        return super.cost()+1;
    }
}
