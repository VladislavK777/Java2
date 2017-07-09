package com.javarush.task.task32.task3210;


import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

/* 
Используем RandomAccessFile
*/

public class Solution {
    public static void main(String... args) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(args[0], "rw");
        randomAccessFile.seek(Long.parseLong(args[1]));
        byte[] buffer = new byte[args[2].length()];
        randomAccessFile.read(buffer, 0, args[2].length());
        if (new String(buffer).equals(args[2])) {
            randomAccessFile.seek(randomAccessFile.length());
            randomAccessFile.write("true".getBytes());
        } else {
            randomAccessFile.seek(randomAccessFile.length());
            randomAccessFile.write("false".getBytes());
        }
        randomAccessFile.close();
    }
}
