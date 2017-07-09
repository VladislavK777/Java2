package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader readerYear = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader readerName = new BufferedReader(new InputStreamReader(System.in));

        String yearS = readerYear.readLine();
        int year = Integer.parseInt(yearS);
        String name = readerName.readLine();

        System.out.println(name + " захватит мир через " + year + " лет. Му-ха-ха!");
        //напишите тут ваш код
    }
}
