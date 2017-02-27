package com.taly.dogTestDrive;

/**
 * Created by Taly on 22.02.2017.
 */
public class Dog {
    int size;
    String name;

    void bark() {
        if (size > 60) {
            System.out.println("Гав Гав!");
        } else if (size > 14) {
            System.out.println("Вуф Вуф!");
        } else {
            System.out.println("Тяф Тяф!");
        }
    }
}
