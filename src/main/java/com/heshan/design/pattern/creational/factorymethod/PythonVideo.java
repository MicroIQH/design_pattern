package com.heshan.design.pattern.creational.factorymethod;

/**
 * @author 杉子
 * @date 2020/6/12 21:48
 */
public class PythonVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制python视频");
    }
}
