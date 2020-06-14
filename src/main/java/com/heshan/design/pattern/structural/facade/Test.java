package com.heshan.design.pattern.structural.facade;

/**
 * @author 杉子
 * @date 2020/6/14 11:09
 */
public class Test {
    public static void main(String[] args) {
        PointsGift pointsGift = new PointsGift("Txue");
        GiftExchangeService giftExchangeService = new GiftExchangeService();



        giftExchangeService.giftExchange(pointsGift);
    }
}
