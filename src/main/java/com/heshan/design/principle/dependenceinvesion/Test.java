package com.heshan.design.principle.dependenceinvesion;

/**
 * @author 杉子
 * @date 2020/6/12 20:21
 */
public class Test {
//    public static void main(String[] args) {
//        Heshan heshan = new Heshan();
//        heshan.studyFECourse();
//        heshan.studyJavaCourse();
//    }
//public static void main(String[] args) {
//    Heshan heshan = new Heshan();
//    heshan.studyCourse(new JavaCourse());
//    heshan.studyCourse(new FECourse());
//    heshan.studyCourse(new PythonCourse());
//}
//public static void main(String[] args) {
//    Heshan heshan = new Heshan(new JavaCourse());
//    heshan.studyCourse();
//}
public static void main(String[] args) {
    Heshan heshan = new Heshan();
    heshan.setiCourse(new JavaCourse());
    heshan.studyCourse();
}
}
