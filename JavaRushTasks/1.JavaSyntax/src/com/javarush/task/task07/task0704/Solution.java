package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = new int[10];
        for (int i = 9; i >= 0; i--) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String s = reader.readLine();
            int a = Integer.parseInt(s);
            array[i] = a;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        //напишите тут ваш код
    }
}

