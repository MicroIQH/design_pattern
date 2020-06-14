package com.heshan.design.principle.demeter;

/**
 * @author 杉子
 * @date 2020/6/12 21:33
 */
public class Test {
    public static void main(String[] args) {
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        boss.commandCheckNumber(teamLeader);
    }
}
