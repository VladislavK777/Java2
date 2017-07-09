package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String in1 = reader.readLine();
        String in2 = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(in1);
        FileOutputStream fileOutputStream = new FileOutputStream(in2);

        while (fileInputStream.available() > 0) {
            byte[] buffer = new byte[fileInputStream.available()];
            fileInputStream.read(buffer);
            for (int i = buffer.length; i >= 1; i--) {
                fileOutputStream.write(buffer[i - 1]);
            }
        }
        fileInputStream.close();
        fileOutputStream.close();
    }
}
