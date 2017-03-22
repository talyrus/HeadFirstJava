package com.taly.ExTestDrive;

/**
 * Created by Taly on 22.03.2017.
 */
class MyEx extends Exception {
}

public class ExTestDrive {
    public static void main(String[] args) {
        String test = args[0];
        try {
            System.out.println("t");
            doRisky(test);
            System.out.println("o");
        } catch (MyEx e) {
            System.out.println("a");
        } finally {
            System.out.println("w");
        }
        System.out.println("s");
    }

    static void doRisky(String t) throws MyEx {
        System.out.println("h");
        if ("yes".equals(t)) {
            throw new MyEx();
        }
        System.out.println("r");
    }
}
