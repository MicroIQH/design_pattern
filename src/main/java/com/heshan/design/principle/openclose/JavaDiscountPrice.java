package com.heshan.design.principle.openclose;

/**
 * @author 杉子
 * @date 2020/6/12 19:58
 */
public class JavaDiscountPrice extends JavaCourse {
    public JavaDiscountPrice(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getOriginPrice(){
        return super.getPrice();
    }

    @Override
    public Double getPrice() {
        return super.getPrice()*0.8;
    }
}
