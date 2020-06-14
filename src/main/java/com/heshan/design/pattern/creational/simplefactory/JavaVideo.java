package com.heshan.design.pattern.creational.simplefactory;

/**
 * @author 杉子
 * @date 2020/6/12 21:48
 */
public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Java的视频");
    }
}
