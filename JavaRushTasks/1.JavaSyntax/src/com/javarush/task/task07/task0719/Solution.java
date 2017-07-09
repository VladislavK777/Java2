package com.javarush.task.task07.task0719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Вывести числа в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            int a = Integer.parseInt(reader.readLine());
            arrayList.add(a);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            int j = arrayList.size() - i - 1;
            System.out.println(arrayList.get(j));
        }
        //напишите тут ваш код
    }
}
