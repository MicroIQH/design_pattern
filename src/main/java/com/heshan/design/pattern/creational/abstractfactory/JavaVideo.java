package com.heshan.design.pattern.creational.abstractfactory;

/**
 * @author 杉子
 * @date 2020/6/13 16:54
 */
public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制java视频");
    }
}
