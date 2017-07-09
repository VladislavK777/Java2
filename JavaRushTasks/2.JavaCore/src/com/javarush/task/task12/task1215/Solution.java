package com.javarush.task.task12.task1215;

/* 
Кошки не должны быть абстрактными!
*/

import java.util.Calendar;

public class Solution {
    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public abstract String getName();
        public abstract Pet getChild();
    }

    public static class Cat extends Pet {
        public String getName() {
            return "";
        }
        public Cat getChild() {
            return new Cat();
        }
    }

    public static class Dog extends Pet {
        public String getName() {
            return "";
        }
        public Dog getChild() {
            return new Dog();
        }
    }

}
