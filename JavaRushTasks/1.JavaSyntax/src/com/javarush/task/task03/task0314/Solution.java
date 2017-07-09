package com.javarush.task.task03.task0314;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            int j;
            for (int x = 1; x < 11; x++){
                j = x * i;
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
