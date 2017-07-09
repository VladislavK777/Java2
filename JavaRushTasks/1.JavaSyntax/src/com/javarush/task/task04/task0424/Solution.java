package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader3 = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader1.readLine();
        String s2 = reader2.readLine();
        String s3 = reader3.readLine();
        int a1 = Integer.parseInt(s1);
        int b1 = Integer.parseInt(s2);
        int c1 = Integer.parseInt(s3);

        if (a1==b1 && a1 !=c1) {
            System.out.println(3);
        }
        else if (a1 == c1 && a1 != b1) {
            System.out.println(2);
        }
        else if (c1 == b1 && b1 != a1) {
            System.out.println(1);
        }
    }
}
