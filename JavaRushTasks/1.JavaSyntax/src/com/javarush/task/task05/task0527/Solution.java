package com.javarush.task.task05.task0527;

/* 
Том и Джерри
*/


public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Cat cat = new Cat("Tom", 15);
        Dog dog = new Dog("Jack");

        //напишите тут ваш код
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Dog {
        String name;
        int age;
        int width;

        public Dog(String n) {
            this.name = n;
        }
    }

    public static class Cat {
        String name;
        int weight;
        int age;

        public Cat(String n, int w) {
            this.name = n;
            this.weight = w;
        }

    }

    //напишите тут ваш код
}
