package com.javarush.task.task05.task0511;

/* 
Создать класс Dog
*/

public class Dog {
    private String name;
    private int height;
    private String color;

    public void initialize(String n) {
        name = n;
    }

    public void initialize(String n, int a) {
        name = n;
        height = a;
    }

    public void initialize(String n, int a, String c) {
        name = n;
        height = a;
        color = c;
    }
    //напишите тут ваш код

    public static void main(String[] args) {

    }
}
