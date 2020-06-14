package com.heshan.design.principle.singleresponsibility;

/**
 * @author 杉子
 * @date 2020/6/12 21:06
 */
public class Method {
    private void updateUserInfo(String userName,String address){
        userName = "heshan";
        address = "12121";
    }

    private void updateUserInfo(String userName,String... properties){
        userName = "heshan";
 //       address = "12121";
    }

    private void updateUsername(String userName){
        userName = "heshan";
    }

    private void updateUserAddress(String address){
        address = "12121";
    }
}
