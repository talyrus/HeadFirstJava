package com.taly.TestBoats;

/**
 * Created by Taly on 14.03.2017.
 */
public class TestBoats {
    public static void main(String[] args) {
        Boat b1 = new Boat();
        Sailboat b2 = new Sailboat();
        Rowboat b3 = new Rowboat();
        b2.setLength(32);
        b1.move();
        b3.move();
        b2.move();
    }
    public static class Boat {
        private int length;
        public void setLength (int len) {
            length = len;
        }
        public int getLength() {
            return length;
        }
        public void move() {
            System.out.print("Дрейф ");
        }
    }
    public static class Sailboat extends Boat {
        public void move() {
            System.out.print("Поднять паруса!");
        }
    }
    public static class Rowboat extends Boat {
        public void rowTheBoat() {
            System.out.println("Давай, Наташа!");
        }
    }


}
