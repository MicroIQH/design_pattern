package com.heshan.design.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 杉子
 * @date 2020/6/12 21:29
 */
public class TeamLeader {
    public void checkNumberOfCourse(){
        List<Course> courseList = new ArrayList<>();
        for (int i=0;i < 20; i++){
            courseList.add(new Course());
        }
        System.out.println("在线课程数目是:" + courseList.size());
    }
}
