package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    private String name;
    private int age;
    private int weight;
    private String address;
    private String color;

    public void initialize(String n) {
        name = n;
        age = 10;
        weight = 15;
        color = "grey";
       // address = null;
    }

    public void initialize(String n, int w, int a) {
        name = n;
        age = a;
        weight = w;
        color = "grey";
       // address = null;
    }

    public void initialize(String n, int a) {
        name = n;
        age = a;
        weight = 15;
        color = "grey";
       // address = null;
    }

    public void initialize(int w, String c) {
       // name = null;
        age = 10;
        weight = w;
        color = c;
       // address = null;
    }

    public void initialize(int w, String c, String ad) {
        age = 10;
        weight = w;
        color = c;
        address = ad;
        //name = null;
    }
    //напишите тут ваш код

    public static void main(String[] args) {

    }
}
