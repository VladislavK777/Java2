package com.javarush.task.task22.task2210;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
StringTokenizer
*/
public class Solution {
    public static void main(String[] args) {
        String s = "level22.lesson13.task01";
        String d = ".";
        //String[] t = getTokens(s,d);
        System.out.println(Arrays.toString(getTokens(s,d)));

    }
    public static String [] getTokens(String query, String delimiter) {
        StringTokenizer tokenizer = new StringTokenizer(query, delimiter);
        String [] s = new String[tokenizer.countTokens()];
        int i = 0;
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            s[i] = token;
            i++;
        }
        return s;
    }
}
