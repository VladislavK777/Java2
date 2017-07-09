package com.javarush.task.task04.task0441;


/* 
Как-то средненько
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
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int c = Integer.parseInt(s3);
        if (a >= c && b < c) {
            System.out.println(c);
        } else if (a <= c && b > c) {
            System.out.println(c);
        } else if (a <= b && c < a) {
            System.out.println(a);
        } else if (a >= b && b > c) {
            System.out.println(b);
        } else if (a <= b && b < c) {
            System.out.println(b);
        } else if (a >= b && a < c) {
            System.out.println(a);
        } else if (b >= c && a < c) {
            System.out.println(c);
        } else if(b >= c && a > b) {
            System.out.println(b);
        } else if (a==b && b==c) {
            System.out.println(a | b | c);
        }
        //напишите тут ваш код
    }
}
