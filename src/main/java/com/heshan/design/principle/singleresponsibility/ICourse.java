package com.heshan.design.principle.singleresponsibility;

/**
 * @author 杉子
 * @date 2020/6/12 21:00
 */
public interface ICourse {
    String getCourseName();
    byte[] getCourseVideo();

    void studyCourse();
    void refundCourse();
}
