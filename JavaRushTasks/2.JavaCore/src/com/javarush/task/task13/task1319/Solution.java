package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Запись в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        //OutputStream outputStream = new FileOutputStream(name);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(name));
        while (true) {
            String text = reader.readLine();
            bufferedWriter.write(text);
            bufferedWriter.newLine();
            if (text.equals("exit")) break;
        }
        bufferedWriter.close();
        reader.close();
        // напишите тут ваш код
    }
}
