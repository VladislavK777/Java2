package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] array = new String[10];
        int[] length = new int[10];
        for (int i = 0; i < array.length; i++) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String s = reader.readLine();
            array[i] = s;
            length[i] = array[i].length();
        }
        for (int i = 0; i < length.length; i++){
            System.out.println(length[i]);
        }
    }
}
