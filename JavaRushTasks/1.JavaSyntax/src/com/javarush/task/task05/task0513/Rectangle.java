package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    private int left, top, width, height;

    public void initialize(int l, int t, int w, int h) {
        left = l;
        top = t;
        width = w;
        height = h;
    }

    public void initialize(int l, int t) {
        left = l;
        top = t;
    }

    public void initialize(int l, int w, int h) {
        left = l;
        top = w;
        width = w;
        height = h;
    }

    public void initialize(Rectangle rectangle) {
        left = rectangle.left;
        top = rectangle.top;
        width = rectangle.width;
        height = rectangle.height;
    }

    //напишите тут ваш код

    public static void main(String[] args) {

    }
}
