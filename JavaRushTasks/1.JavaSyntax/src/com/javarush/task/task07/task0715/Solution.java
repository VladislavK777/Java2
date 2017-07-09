package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> arrayList = new ArrayList<String>();
        String[] s = {"мама", "мыла", "раму"};
        for (int i = 0; i < s.length; i++) {
            arrayList.add(s[i]);
        }
        for (int i = 1; i < 6; i += 2) {
            arrayList.add(i, "именно");
        }
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        //напишите тут ваш код
    }
}
