package com.heshan.design.pattern.creational.abstractfactory;

/**
 * @author 杉子
 * @date 2020/6/13 16:53
 */
public class JavaCourseFactory implements CourseFactory{
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Arcticle getArcticle() {
        return new JavaArcticle();
    }
}
