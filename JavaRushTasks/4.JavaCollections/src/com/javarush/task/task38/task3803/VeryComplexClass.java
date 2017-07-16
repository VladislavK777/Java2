package com.javarush.task.task38.task3803;

/* 
Runtime исключения (unchecked exception)
*/

public class VeryComplexClass {
    public void methodThrowsClassCastException() {
        Object c = new Character('1');
        System.out.println((byte) c);

    }

    public void methodThrowsNullPointerException() {
        int [] array = null;
        System.out.println(array.length);
    }

    public static void main(String[] args) {

    }
}
