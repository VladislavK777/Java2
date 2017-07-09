package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {
        //System.out.println(result);
    }
    
    static {

        reset();
        //add your code here - добавьте код тут
    }

    public static Flyable result;

    public static void reset() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String type = reader.readLine();
            if (type.equals("helicopter")) {
                Solution.result = new Helicopter();
            } else if (type.equals("plane")) {
                int a = Integer.parseInt(reader.readLine());
                Solution.result = new Plane(a);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //add your code here - добавьте код тут
    }
}
