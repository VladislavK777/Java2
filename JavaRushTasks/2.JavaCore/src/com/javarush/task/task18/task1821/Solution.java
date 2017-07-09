package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        byte[] buffer = new byte[fileInputStream.available()];
        while (fileInputStream.available() > 0) {
            fileInputStream.read(buffer);
        }
        Map<Character, Integer> map = new TreeMap<Character, Integer>();
        char[] s = new char[buffer.length];
        for (int i = 0; i < buffer.length; i++) {
            s[i] = (char) buffer[i];
        }
        for (int i = 0; i < s.length; i++) {
            int count = 0;
            for (int j = 0; j < buffer.length; j++) {
                if (s[i] == buffer[j]) {
                    count++;
                }
            }
            map.put(s[i], count);
        }
        fileInputStream.close();
        for (Map.Entry<Character, Integer> pair : map.entrySet()) {
            System.out.println((char) pair.getKey() + " " + pair.getValue());
        }
    }
}
