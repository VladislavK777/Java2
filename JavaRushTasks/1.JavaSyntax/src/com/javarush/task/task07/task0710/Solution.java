package com.javarush.task.task07.task0710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
В начало списка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        for(int i = 0; i < 10; i++){
            String s = read.readLine();
            list.add(0, s);
        }
        for(int b = 0; b < list.size(); b++){
            System.out.println(list.get(b));
        }
        //напишите тут ваш код
    }
}
