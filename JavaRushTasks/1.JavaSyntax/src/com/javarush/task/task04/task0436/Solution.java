package com.javarush.task.task04.task0436;


/* 
Рисуем прямоугольник
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader2.readLine();
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("8");
            }
            System.out.println();
        }
        //напишите тут ваш код

    }
}
