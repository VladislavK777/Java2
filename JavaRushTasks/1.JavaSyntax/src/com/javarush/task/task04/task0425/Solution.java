package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/

import org.omg.PortableInterceptor.INACTIVE;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader1.readLine();
        String s2 = reader2.readLine();
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);

        if (a > 0 && b > 0)
            System.out.println("1");
        else if (a < 0 && b > 0)
            System.out.println("2");
        else if (a < 0 && b < 0)
            System.out.println("3");
        else if (a > 0 && b < 0)
            System.out.println("4");
        //напишите тут ваш код
    }
}
