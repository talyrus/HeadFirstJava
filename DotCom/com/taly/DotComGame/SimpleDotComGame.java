package com.taly.DotComGame;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Taly on 25.02.2017.
 */
public class SimpleDotComGame {
    public static void main(String[] args) {
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();
        DotCom theDotCom = new DotCom();

        int randomNum = (int) (Math.random() * 5);
        ArrayList<String> locations = new ArrayList();
        locations.add(Integer.toString(randomNum));
        locations.add(Integer.toString(randomNum + 1));
        locations.add(Integer.toString(randomNum + 2));
        theDotCom.setLocationCells(locations);

        boolean isAlive = true;
        while (isAlive == true) {
            String guess = helper.getUserInput("Введите число");
            String result = theDotCom.checkYourSelf(guess);
            numOfGuesses++;
            if (result.equals("Потопил")) {
                isAlive = false;
                System.out.println("Вам потребовалось " + numOfGuesses + " попыток(и)");
            }
        }
    }
}
