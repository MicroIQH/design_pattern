package com.heshan.design.pattern.creational.protopyte.clone;

import java.util.Date;

/**
 * @author 杉子
 * @date 2020/6/14 10:17
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date birthday = new Date(0L);
        Pig pig1 = new Pig("佩奇",birthday);
        Pig pig2 = (Pig) pig1.clone();

        System.out.println(pig1);
        System.out.println(pig2);
    }
}
