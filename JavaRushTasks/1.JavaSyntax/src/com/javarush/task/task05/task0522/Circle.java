package com.javarush.task.task05.task0522;

/* 
Максимум конструкторов
*/

public class Circle {
    public double x;
    public double y;
    public double radius;

    public Circle (double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.radius = r;
    }

    public Circle (double x, double r) {
        this.x = x;
        this.radius = r;
    }

    public Circle () {
        this(5,4,10);
    }

    public Circle (double y) {
        this(10, y, 5);
    }

    //напишите тут ваш код

    public static void main(String[] args) {

    }
}