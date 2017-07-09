package com.javarush.task.task12.task1218;

/* 
Есть, летать и двигаться
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface Fly {
        public void fly();
    }

    public interface Move {
        public void move();
    }

    public interface Eat {
        public void eat();
    }

    public class Dog implements Move, Eat{
        public void move() {
            System.out.println("go");
        }

        public void eat() {
            System.out.println("ням");
        }
    }

    public class Duck implements Fly, Eat, Move {
        public void move() {
            System.out.println("go");
        }

        public void eat() {
            System.out.println("ням");
        }

        public void fly() {
            System.out.println("полетели");
        }
    }

    public class Car  implements Move {
        public void move() {
            System.out.println("go");
        }
    }

    public class Airplane implements Fly, Move {
        public void move() {
            System.out.println("go");
        }

        public void fly() {
            System.out.println("полетели");
        }
    }
}
