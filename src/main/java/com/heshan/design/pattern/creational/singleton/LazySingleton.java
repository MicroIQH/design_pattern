package com.heshan.design.pattern.creational.singleton;

/**
 * @author 杉子
 * @date 2020/6/13 21:59
 */
public class LazySingleton {
    private static LazySingleton lazySingleton = null;

    private LazySingleton(){

    }

    public static LazySingleton getInstance(){
        if (lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
