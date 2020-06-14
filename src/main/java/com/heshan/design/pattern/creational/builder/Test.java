package com.heshan.design.pattern.creational.builder;

/**
 * @author 杉子
 * @date 2020/6/13 21:10
 */
public class Test {
    public static void main(String[] args) {
        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);

        Course course = coach.makeCourse("java","javappt","javaship","javashouji","javaqa");
        System.out.println(course);
    }
}
