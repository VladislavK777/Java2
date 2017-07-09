package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);


    }

    public static void sort(String[] array) {
        HashMap<Integer, String> number = new HashMap<Integer, String>();
        HashMap<Integer, String> words = new HashMap<Integer, String>();
        ArrayList<Integer> temp_num = new ArrayList<Integer>();
        ArrayList<String> temp_words = new ArrayList<String>();
        for (int i = 0; i < array.length; i++) {
            if (isNumber(array[i])) {
                number.put(i, "true");
            } else {
                words.put(i, "false");
            }
        }
        for (Map.Entry pair_number : number.entrySet()) {
            for (int i = 0; i < array.length; i++) {
                if (i == (Integer) pair_number.getKey()) {
                    temp_num.add(Integer.parseInt(array[i]));
                }
            }
        }
        for (Map.Entry pair_words : words.entrySet()) {
            for (int i = 0; i < array.length; i++) {
                if (i == (Integer) pair_words.getKey()) {
                    temp_words.add(array[i]);
                }
            }
        }
        int tmp = 0;
        for (int i = 0; i < temp_num.size(); i++) {
            for (int j = 0; j < temp_num.size(); j++) {
                if (temp_num.get(i) > temp_num.get(j)) {
                    tmp = temp_num.get(j);
                    temp_num.set(j, temp_num.get(i));
                    temp_num.set(i, tmp);
                }
            }
        }
        String temp = null;
        for (int i = 0; i < temp_words.size(); i++) {
            for (int j = 0; j < temp_words.size(); j++) {
                if (isGreaterThan(temp_words.get(j), temp_words.get(i))) {
                    temp = temp_words.get(i);
                    temp_words.set(i, temp_words.get(j));
                    temp_words.set(j, temp);
                }
            }
        }
        System.out.println(number);
        System.out.println(words);
        System.out.println(temp_num);
        System.out.println(temp_words);

        //напишите тут ваш код
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-')) // не цифра и не начинается с '-'
            {
                return false;
            }
        }
        return true;
    }
}
