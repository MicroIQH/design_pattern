package com.heshan.design.pattern.structural.adapter.classadapter;

/**
 * @author 杉子
 * @date 2020/6/14 19:39
 */
public class ConcreteTarget implements Target {
    @Override
    public void requrst() {
        System.out.println("concreateTarget目标方法");
    }
}
