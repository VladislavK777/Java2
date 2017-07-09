package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2  =reader2.readLine();
        if (name1.equals(name2))
            System.out.println("Имена идентичны");
        else if (name1.length() == name2.length())
            System.out.println("Длины имен равны");
        //напишите тут ваш код
    }
}
