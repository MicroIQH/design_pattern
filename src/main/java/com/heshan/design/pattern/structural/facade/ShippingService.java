package com.heshan.design.pattern.structural.facade;

/**
 * @author 杉子
 * @date 2020/6/14 10:51
 */
public class ShippingService {
    public String shipGift(PointsGift pointsGift){
        System.out.println(pointsGift.getName() + "进入物流系统");
        String shippingOrderNo = "66";
        return  shippingOrderNo;
    }
}
