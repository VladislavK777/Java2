package com.javarush.task.task04.task0423;

/* 
Фейс-контроль
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String s1 = reader1.readLine();
        int age = Integer.parseInt(s1);
        if (age > 20)
            System.out.println("И 18-ти достаточно");
        //напишите тут ваш код
    }
}
