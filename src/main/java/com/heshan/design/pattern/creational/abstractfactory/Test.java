package com.heshan.design.pattern.creational.abstractfactory;

/**
 * @author 杉子
 * @date 2020/6/13 17:03
 */
public class Test {
    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCourseFactory();
        Video video = courseFactory.getVideo();
        Arcticle arcticle = courseFactory.getArcticle();
        video.produce();
        arcticle.produce();


    }
}
