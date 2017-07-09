package com.javarush.task.task03.task0322;


/* 
Большая и чистая
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader readerName1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader readerName2 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader readerName3 = new BufferedReader(new InputStreamReader(System.in));

        String name1 = readerName1.readLine();
        String name2 = readerName2.readLine();
        String name3 = readerName3.readLine();

        System.out.println(name1 + " + " + name2 + " + " + name3 + " = Чистая любовь, да-да!");
        //напишите тут ваш код
    }
}