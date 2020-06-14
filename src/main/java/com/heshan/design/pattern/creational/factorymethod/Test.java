package com.heshan.design.pattern.creational.factorymethod;

/**
 * @author 杉子
 * @date 2020/6/12 21:49
 */
public class Test {
    public static void main(String[] args) {

        VideoFactory videoFactory = new FEVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();

    }
}
