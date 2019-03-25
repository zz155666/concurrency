package com.bfxy.disruptorapi.quickstart;

import com.lmax.disruptor.EventFactory;

public class OrderEventFactory2 implements EventFactory<OrderEvent> {
    @Override
    public OrderEvent newInstance() {
        return new OrderEvent(); //这个方式是为了返回空的数据对象
    }
}
