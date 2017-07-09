package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(name1);
        FileOutputStream fileOutputStream = new FileOutputStream(name2);
        byte[] bt = new byte[fileInputStream.available()];
        fileInputStream.read(bt);
        fileInputStream.close();
        String[] numbers = new String(bt).split(" ");
        String line = "";

        for (String s : numbers){
            line += Math.round(Double.parseDouble(s)) + " ";
        }
        fileOutputStream.write(line.trim().getBytes());
        fileOutputStream.close();

    }
}
