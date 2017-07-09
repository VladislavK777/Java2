package com.javarush.task.task04.task0422;

/* 
18+
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String s1 = reader1.readLine();
        int age = Integer.parseInt(s1);
        if (age < 18)
            System.out.println("Подрасти еще");
        //напишите тут ваш код
    }
}
