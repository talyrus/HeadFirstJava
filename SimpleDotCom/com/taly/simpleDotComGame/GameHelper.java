package com.taly.simpleDotComGame;
import java.io.*;
/**
 * Created by Taly on 25.02.2017.
 */
public class GameHelper {
    public String getUserInput(String promt) {
        String inputLine = null;
        System.out.print(promt + " ");
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0) return null;
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }
        return inputLine;
    }
}
