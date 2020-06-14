package com.heshan.design.principle.dependenceinvesion;

/**
 * @author 杉子
 * @date 2020/6/12 20:19
 */
public class Heshan {

    private ICourse iCourse;

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void studyCourse(){
        iCourse.studyCourse();
    }
}
