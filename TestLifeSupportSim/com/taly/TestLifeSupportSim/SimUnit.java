package com.taly.TestLifeSupportSim;

/**
 * Created by Taly on 15.03.2017.
 */
public class SimUnit {
    String botTipe;
    SimUnit (String type) {
        botTipe = type;
        System.out.println(botTipe);
    }
    int powerUse() {
        if ("Тепловая машина".equals(botTipe)) {
            return 2;
        } else {
            return 4;
        }
    }
}
