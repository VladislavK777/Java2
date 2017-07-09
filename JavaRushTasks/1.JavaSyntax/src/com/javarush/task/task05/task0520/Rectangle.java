package com.javarush.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle)
*/


public class Rectangle {
    private int left, top, width, height;

    public Rectangle(int l, int t, int w, int h) {
        left = l;
        top = t;
        width = w;
        height = h;
    }

    public Rectangle(int l, int t) {
        left = l;
        top = t;
    }

    public Rectangle(int l, int w, int h) {
        left = l;
        top = w;
        width = w;
        height = h;
    }

    public Rectangle(Rectangle rectangle) {
        left = rectangle.left;
        top = rectangle.top;
        width = rectangle.width;
        height = rectangle.height;
    }

    public static void main(String[] args) {

    }
}
