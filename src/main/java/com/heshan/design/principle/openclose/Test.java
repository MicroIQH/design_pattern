package com.heshan.design.principle.openclose;

/**
 * @author 杉子
 * @date 2020/6/12 19:49
 */
public class Test {
    public static void main(String[] args) {
        ICourse iCourse = new JavaDiscountPrice(11,"java",999d);
        JavaDiscountPrice javaCourse = (JavaDiscountPrice) iCourse;
        System.out.println("课程ID"+javaCourse.getId()+"课程名称"+javaCourse.getName()+"课程原价"+javaCourse.getOriginPrice()+"课程折扣价格"+javaCourse.getPrice()+"元");
    }
}
