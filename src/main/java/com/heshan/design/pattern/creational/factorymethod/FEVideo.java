package com.heshan.design.pattern.creational.factorymethod;

/**
 * @author 杉子
 * @date 2020/6/13 16:27
 */
public class FEVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制FE的视频");
    }
}
