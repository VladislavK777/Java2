package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        String name3 = reader.readLine();
        FileOutputStream fileOutputStream1 = new FileOutputStream(name1);
        FileInputStream fileInputStream2 = new FileInputStream(name2);
        FileInputStream fileInputStream3 = new FileInputStream(name3);
        while (fileInputStream2.available() > 0) {
            fileOutputStream1.write(fileInputStream2.read());
        }
        while (fileInputStream3.available() > 0) {
            fileOutputStream1.write(fileInputStream3.read());
        }
        fileInputStream2.close();
        fileInputStream3.close();
        fileOutputStream1.close();
    }
}
