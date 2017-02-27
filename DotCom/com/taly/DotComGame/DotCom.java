package com.taly.DotComGame;

import java.util.ArrayList;

/**
 * Created by Taly on 25.02.2017.
 */
public class DotCom {
    private ArrayList<String> locationCells;

    public void setLocationCells(ArrayList<String> locs) {
        this.locationCells = locs;
    }

    public String checkYourSelf(String userInput) {
        String result = "Мимо";
        // если значения нет, то вернется "-1", иначе индекс искомогоэлемента
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "Потопил";
            } else {
                result = "Попал";
            }
        }
        System.out.println(result);
        return result;
    }
}
