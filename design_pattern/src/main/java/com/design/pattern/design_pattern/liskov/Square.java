package com.design.pattern.design_pattern.liskov;

public class Square implements Quadrangle{

    private long sideLength;


    @Override
    public long getWidth() {
        return sideLength;
    }

    @Override
    public long getLenth() {
        return sideLength;
    }

    public void setSideLength(long sideLength) {
        this.sideLength = sideLength;
    }
}
