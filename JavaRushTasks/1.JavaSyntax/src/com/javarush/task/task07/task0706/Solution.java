package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] address = new int[15];
        int countEven = 0;
        int countOdd = 0;
        for (int i = 0; i < 15; i++) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int a = Integer.parseInt(reader.readLine());
            if (i % 2 == 0) {
                address[i] = a;
                countEven += a;
            } else {
                address[i] = a;
                countOdd += a;
            }
        }
        if (countEven > countOdd)
            System.out.println("В домах с четными номерами проживает больше жителей.");
        else
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        //напишите тут ваш код
    }
}
