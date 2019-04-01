package com.design.pattern.design_pattern.structural.facade;

public class GiftExchangeService {
    private QualifyService qualifyService=new QualifyService();
    private PointsPaymentService pointsPaymentService=new PointsPaymentService();

    public void giftExchange(){
        if(qualifyService.isAvailable(new PointGift())){
            if(pointsPaymentService.pay(new PointGift())){
                return;
            }
        }
    }
}
