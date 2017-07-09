package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        FileInputStream fileInputStream1 = new FileInputStream(name1);
        FileInputStream fileInputStream2 = new FileInputStream(name2);
        FileOutputStream fileOutputStream1 = new FileOutputStream(name1);
        byte[] buffer1 = new byte[fileInputStream1.available()];
        byte[] buffer2 = new byte[fileInputStream2.available()];
        while (fileInputStream1.available() > 0) {
            fileInputStream1.read(buffer1);
        }
        while (fileInputStream2.available() > 0) {
            fileInputStream2.read(buffer2);
        }
        fileOutputStream1.write(buffer2);
        fileOutputStream1.write(buffer1);
        fileInputStream1.close();
        fileInputStream2.close();
        fileOutputStream1.close();
    }
}
