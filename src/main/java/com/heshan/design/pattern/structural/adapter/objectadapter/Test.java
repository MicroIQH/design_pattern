package com.heshan.design.pattern.structural.adapter.classadapter;

/**
 * @author 杉子
 * @date 2020/6/14 19:42
 */
public class Test {
    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.requrst();

        Target adapterTarget = new Adapter();
        adapterTarget.requrst();
    }

}
