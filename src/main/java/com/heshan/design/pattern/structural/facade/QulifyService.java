package com.heshan.design.pattern.structural.facade;

/**
 * @author 杉子
 * @date 2020/6/14 10:44
 */
public class QulifyService {
    public boolean isAvailable(PointsGift pointsGift){
        System.out.println("校验" + pointsGift.getName());
        return true;
    }
}
