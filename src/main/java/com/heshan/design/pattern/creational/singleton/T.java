package com.heshan.design.pattern.creational.singleton;

/**
 * @author 杉子
 * @date 2020/6/13 22:03
 */
public class T implements Runnable {
    @Override
    public void run() {
        LazySingleton lazySingleton = LazySingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+"-->"+lazySingleton);
    }
}
