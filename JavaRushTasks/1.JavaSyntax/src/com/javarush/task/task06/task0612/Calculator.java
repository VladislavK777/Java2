package com.javarush.task.task06.task0612;

/* 
Калькулятор
*/

public class Calculator {
    public static int plus(int a, int b) {
        int sum = a + b;
        //напишите тут ваш код
        return sum;
    }

    public static int minus(int a, int b) {
        int min = a - b;
        //напишите тут ваш код
        return min;
    }

    public static int multiply(int a, int b) {
        int mul = a * b;
        //напишите тут ваш код
        return mul;
    }

    public static double division(int a, int b) {
        double div = (double) a / b;
        //напишите тут ваш код
        return div;
    }

    public static double percent(int a, int b) {
        double per = (double) (a * b) / 100;
        //напишите тут ваш код
        return per;
    }

    public static void main(String[] args) {

    }
}