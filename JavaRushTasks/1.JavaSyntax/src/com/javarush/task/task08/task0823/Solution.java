package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        char[] c = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            c[0] = Character.toUpperCase(c[0]);
            if(s.charAt(i) == ' ') c[i + 1] = Character.toUpperCase(c[i + 1]);
        }
        for (char ch : c) {
            System.out.print(ch);
        }
    }
}
