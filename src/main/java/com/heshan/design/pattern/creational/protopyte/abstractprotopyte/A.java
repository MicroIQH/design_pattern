package com.heshan.design.pattern.creational.protopyte.abstractprotopyte;

/**
 * @author 杉子
 * @date 2020/6/14 10:13
 */
public abstract class A implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
