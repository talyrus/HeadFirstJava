package com.taly.testBox;

/**
 * Created by Taly on 19.03.2017.
 */
public class TestBox {
    Integer i;
    int j;

    public static void main(String[] args) {
        TestBox t = new TestBox();
        t.go();
    }
    public void go() {
        j = i; //нельзя присвоить ссылку примитиву
        System.out.println(j);
        System.out.println(i);
    }
}
