package com.heshan.design.pattern.creational.factorymethod;

/**
 * @author 杉子
 * @date 2020/6/13 16:24
 */
public class JavaVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
