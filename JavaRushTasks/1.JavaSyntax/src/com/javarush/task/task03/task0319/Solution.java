package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader readerName = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader readerSol = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader readerYear = new BufferedReader(new InputStreamReader(System.in));

        String name = readerName.readLine();
        String sol = readerSol.readLine();
        String year = readerYear.readLine();
        int s = Integer.parseInt(sol);
        int y = Integer.parseInt(year);

        System.out.println(name + " получает " + s + " через " + y + " лет.");
        //напишите тут ваш код
    }
}
