package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = new int[20];
        int[] arrayNum1 = new int[10];
        int[] arrayNum2 = new int[10];

        for (int i = 0; i < 20; i++) {
            BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
            String s = reader.readLine();
            int a = Integer.parseInt(s);
            array[i] = a;
            if (i < 10) {
                arrayNum1[i] = array[i];
            } else {
                arrayNum2[i - 10] = array[i];
            }
        }

        for (int i = 0; i < arrayNum2.length; i++) {
            System.out.println(arrayNum2[i]);
        }
        //напишите тут ваш код
    }
}
