package com.heshan.design.pattern.structural.facade;

/**
 * @author 杉子
 * @date 2020/6/14 10:49
 */
public class PointPaymentService {
    public boolean pay(PointsGift pointsGift){
        System.out.println("支付" + pointsGift.getName());
        return true;
    }
}
