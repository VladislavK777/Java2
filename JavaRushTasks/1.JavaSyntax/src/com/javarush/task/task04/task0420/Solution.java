package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] a = {Integer.parseInt(reader.readLine()), Integer.parseInt(reader.readLine()), Integer.parseInt(reader.readLine())};
        for (int i = 0; i < 3; i++) {
            int max = a[i];
            for (int j = i + 1; j < 3; j++) {
                if (a[j] > max) {
                    max = a[j];
                    a[j] = a[i];
                    a[i] = max;
                }
            }
            System.out.print(a[i]+" ");
        }
    }
}
