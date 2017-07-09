package com.javarush.task.task01.task0133;

/* 
Не думать о секундах…
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getCountSecondsPassedInCurrentHour(12345));
    }

    public static int getCountSecondsPassedInCurrentHour(int seconds) {
        int x = 0;
        while ( x <= 3600 ) {
            x = seconds;
            x = x - (x / 3600)*3600;
            return x;
        }
        return x;
        //напишите тут ваш код
    }
}