package com.javarush.task.task04.task0443;


/* 
Как назвали, так назвали
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader readerName = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader readerYear = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader readerMouth = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader readDay = new BufferedReader(new InputStreamReader(System.in));
        String s = readerName.readLine();
        int year = Integer.parseInt(readerYear.readLine());
        int mouth = Integer.parseInt(readerMouth.readLine());
        int day = Integer.parseInt(readDay.readLine());
        System.out.println("Меня зовут " + s + ".");
        System.out.println("Я родился " + day + "." + mouth + "." +year);
    }
}
