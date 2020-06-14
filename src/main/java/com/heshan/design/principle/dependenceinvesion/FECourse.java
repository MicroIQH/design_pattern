package com.heshan.design.principle.dependenceinvesion;

/**
 * @author 杉子
 * @date 2020/6/12 20:23
 */
public class FECourse implements ICourse{
    @Override
    public void studyCourse() {
        System.out.println("何杉学习前端课程");
    }
}
