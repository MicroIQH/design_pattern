package com.heshan.design.pattern.creational.abstractfactory;

/**
 * @author 杉子
 * @date 2020/6/13 16:57
 */
public class PythonCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }

    @Override
    public Arcticle getArcticle() {
        return new PythonArtcle();
    }
}
