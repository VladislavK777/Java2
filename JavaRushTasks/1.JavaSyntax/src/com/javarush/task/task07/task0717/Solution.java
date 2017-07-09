package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s);
        }
        // Считать строки с консоли и объявить ArrayList list тут

        ArrayList<String> result = doubleValues(list);

        for (int i = 0; i < result.size(); i++)
            System.out.println(result.get(i));

        // Вывести на экран result
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            list.add(i + 1, list.get(i));
            i++;
        }
        //напишите тут ваш код
        return list;
    }
}
