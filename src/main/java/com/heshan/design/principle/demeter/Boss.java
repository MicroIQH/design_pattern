package com.heshan.design.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 杉子
 * @date 2020/6/12 21:27
 */
public class Boss {
    public void commandCheckNumber(TeamLeader teamLeader){
        teamLeader.checkNumberOfCourse();
    }
}
