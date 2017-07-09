package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        URL url = new URL(reader.readLine());
        String list = url.getQuery();
        String[] list1 = list.split("&");
        String value = null;
        for (int i = 0; i < list1.length; i++) {
            if (list1[i].split("=")[0].equals("obj")) {
                value = list1[i].split("=")[1];
            }
            System.out.print(list1[i].split("=")[0]+ " ");
        }
        //System.out.println(list1[1]);
        if (value != null) {
            try {
                System.out.println();
                alert(Double.parseDouble(value));
            } catch (Exception e) {
                System.out.println();
                alert(value);
            }
        }


        //add your code here
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
