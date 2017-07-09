package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import javafx.scene.chart.BubbleChart;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    public static void main(String[] args) throws IOException {
        String name = args[0];
        FileInputStream fileInputStream = new FileInputStream(name);
        int count = 0;
        byte[] buffer = new byte[fileInputStream.available()];
        while (fileInputStream.available() > 0) {
            fileInputStream.read(buffer);
        }
        fileInputStream.close();
        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j < buffer.length; j++) {
                if (letters[i] == buffer[j]) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
