package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String name = reader.readLine();
            FileInputStream fileInputStream = null;
            try {
                fileInputStream = new FileInputStream(name);
                fileInputStream.read();
            } catch (FileNotFoundException e) {
                System.out.println(name);
                break;
            }
            fileInputStream.close();
        }
    }
}
