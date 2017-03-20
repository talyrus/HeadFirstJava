package com.taly.staticTests;

/**
 * Created by Taly on 20.03.2017.
 */
class StaticSuper {
    static {
        System.out.println("Родительский статический блок");
    }
    StaticSuper() {
        System.out.println("Родительский конструктор");
    }
}
