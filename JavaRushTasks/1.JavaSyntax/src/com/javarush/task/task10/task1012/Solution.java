package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
            //System.out.println(alphabet);
        }

        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 1; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        String s = null;
        for (int i = 0; i < list.size(); i++) {
            s = s + list.get(i);
        }

        char[] charList = s.toCharArray();
        for (int i = 0; i < alphabet.size(); i++) {
            int count = 0;
            for (int j = 0; j < charList.length; j++) {
                if (alphabet.get(i).equals(charList[j])) {
                    count = count + 1;
                }
            }
            System.out.println(alphabet.get(i) + " " + count);
        }
    }
}
