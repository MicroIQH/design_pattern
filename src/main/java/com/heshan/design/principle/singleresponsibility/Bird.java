package com.heshan.design.principle.singleresponsibility;

/**
 * @author 杉子
 * @date 2020/6/12 20:51
 */
public class Bird {
    public void mainMoveMode(String birdName){
        if ("鸵鸟".equals(birdName)){
            System.out.println(birdName+"用脚走");
        }else {
            System.out.println(birdName + "用翅膀飞");
        }

    }
}
