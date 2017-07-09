package com.javarush.task.task32.task3201;

import java.io.IOException;
import java.io.RandomAccessFile;

/*
Запись в существующий файл
*/
public class Solution {
    public static void main(String... args) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(args[0], "rw");
        String text = args[2];
        if (Long.parseLong(args[1]) < randomAccessFile.length()) {
            randomAccessFile.seek(Long.parseLong(args[1]));
            randomAccessFile.write(text.getBytes());
        } else {
            randomAccessFile.seek(randomAccessFile.length());
            randomAccessFile.write(text.getBytes());
        }
        randomAccessFile.close();
    }
}
