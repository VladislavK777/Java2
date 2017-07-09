package com.javarush.task.task13.task1318;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.*;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        InputStream inStream = new FileInputStream(name);
        //Solution myObject = new Solution();

        while (inStream.available() > 0) {
            System.out.print((char)inStream.read());
        }
        inStream.close();
        reader.close();
        System.out.println();
        // напишите тут ваш код
    }
}