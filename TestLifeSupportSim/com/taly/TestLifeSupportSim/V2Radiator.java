package com.taly.TestLifeSupportSim;

import java.util.ArrayList;

/**
 * Created by Taly on 15.03.2017.
 */
public class V2Radiator {
    V2Radiator(ArrayList list) {
        for (int x = 0; x < 5; x++) {
            list.add(new SimUnit("V2Radiator"));
        }
    }
}
