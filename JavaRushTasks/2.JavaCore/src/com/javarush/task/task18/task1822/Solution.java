package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
        String filename = file.readLine();
        FileInputStream fileInputStream = new FileInputStream(filename);
        BufferedReader reader = new BufferedReader(new InputStreamReader(fileInputStream));
        String line = reader.readLine();
        while (line != null) {
            String[] name = line.split(" ");
            if (args[0].equals(name[0])) {
                for (int i = 0; i < name.length; i++) {
                    System.out.print(name[i] + " ");
                }
            }
            line = reader.readLine();
        }
        reader.close();
    }
}
