package com.taly.simpleDotComGame;

/**
 * Created by Taly on 25.02.2017.
 */
public class SimpleDotCom {
    int[] locationCells;
    int numOfHeats = 0;

    public void setLocationCells(int[] locs) {
        this.locationCells = locs;
    }

    public String checkYourSelf(String stringGuess) {
        int guess = Integer.parseInt(stringGuess);
        String result = "Мимо";
        for (int cell : locationCells) {
            if (guess == cell) {
                result = "Попал";
                numOfHeats++;
                break;
            }
        }
        if (numOfHeats == locationCells.length) {
            result = "Потопил";
        }
        System.out.println(result);
        return result;
    }
}
