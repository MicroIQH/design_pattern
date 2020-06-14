package com.heshan.design.principle.singleresponsibility;

/**
 * @author 杉子
 * @date 2020/6/12 21:05
 */
public class CourseImpl implements ICourseContent,ICourseManager {
    @Override
    public String getCourseName() {
        return null;
    }

    @Override
    public byte[] getCourseVideo() {
        return new byte[0];
    }

    @Override
    public void studyCourse() {

    }

    @Override
    public void refundCourse() {

    }
}
