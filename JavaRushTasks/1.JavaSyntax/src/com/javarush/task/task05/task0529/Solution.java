package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int sum = 0;
        for (; true;) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String s = reader.readLine();
            if (!s.equals("сумма")) {
                int a = Integer.parseInt(s);
                sum = sum + a;
            } else {
                break;
            }
        }
        System.out.println(sum);
        //напишите тут ваш код
    }
}
