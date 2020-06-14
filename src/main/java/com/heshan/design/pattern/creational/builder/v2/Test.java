package com.heshan.design.pattern.creational.builder.v2;

/**
 * @author 杉子
 * @date 2020/6/13 21:24
 */
public class Test {
    public static void main(String[] args) {
        Course course = new Course.CourseBuilder().builderCourseName("java").buildCoursePPT("javappt").build();
        System.out.println(course);
    }
}
