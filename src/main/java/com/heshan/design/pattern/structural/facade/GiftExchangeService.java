package com.heshan.design.pattern.structural.facade;

/**
 * @author 杉子
 * @date 2020/6/14 11:05
 */
public class GiftExchangeService {
    private QulifyService qulifyService = new QulifyService();
    private PointPaymentService pointPaymentService = new PointPaymentService();
    private ShippingService shippingService = new ShippingService();


    public void giftExchange(PointsGift pointsGift){
        if (qulifyService.isAvailable(pointsGift)){
            if (pointPaymentService.pay(pointsGift)){
                String shippingOrderNo = shippingService.shipGift(pointsGift);
                System.out.println("成功" + shippingOrderNo);
            }
        }
    }
}
