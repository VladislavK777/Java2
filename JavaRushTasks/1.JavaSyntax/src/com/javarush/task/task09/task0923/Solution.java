package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.ArrayList;


/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};


    public static void main(String[] args) throws Exception {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            ArrayList list1 = new ArrayList();
            char[] c = reader.readLine().replace(" ","").toCharArray();
            for (int i = 0; i < c.length; i++) {
                if (isVowel(c[i])) {
                    System.out.print(c[i] + " ");
                } else {
                    list1.add(c[i]);
                }
            }
            System.out.println();
            for (int i = 0; i < list1.size(); i++) {
                System.out.print(list1.get(i) + " ");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        //напишите тут ваш код
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}