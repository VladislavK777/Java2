package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

import static java.util.Collections.sort;

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<Integer>();
        String file;
        int line = 0;
        BufferedReader redfilename = new BufferedReader(new InputStreamReader(System.in));

        file = redfilename.readLine();

        BufferedReader readfile = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        while (readfile.ready()) {
            try {
                line = Integer.parseInt(readfile.readLine());
            } catch (NumberFormatException e) {
                e.printStackTrace();
                continue;
            }
            if ((line % 2) == 0) {
                list.add(line);
            }
        }
        Collections.sort(list);
        for (int i : list) {
            System.out.println(i);
        }
        readfile.close();
    }
}
