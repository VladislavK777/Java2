package com.javarush.task.task20.task2026;

/* 
Алгоритмы-прямоугольники
*/
public class Solution {
    public static void main(String[] args) {
        byte[][] a = new byte[][]{
                {1, 1, 0, 0}, //i=0
                {1, 1, 0, 0}, //i=1
                {1, 1, 0, 0}, //i=3
                {1, 1, 0, 1}  //i=4
        };
        int count = getRectangleCount(a);
        System.out.println("count = " + count + ". Должно быть 2");
    }

    public static int getRectangleCount(byte[][] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i][j] == 1) {
                    count++;
                    for (int k = i; k < a.length; k++) {
                        if (a[k][j] == 0) break;
                        for (int l = j; l < a.length; l++) {
                            if(a[k][l] == 1) a[k][l] = 0;
                            else break;
                        }
                    }
                }
            }
        }
        return count;
    }
}
