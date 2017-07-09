package com.javarush.task.task18.task1825;

/* 
Собираем файл
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        Map<String, Integer> map = new TreeMap<String, Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = null;
        FileInputStream fileInputStream = null;
        byte[] buffer = null;
        ArrayList<String> list = new ArrayList<String>();
        int i = 1;
        while (true){
            name = reader.readLine();
            if ("end".equals(name))
                break;
            else
                list.add(name);
                map.put(name, i++);
        }
        String mainFileName = list.get(0).substring(0, list.get(0).lastIndexOf(".part"));
        FileOutputStream fileOutputStream = new FileOutputStream(mainFileName);
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            fileInputStream = new FileInputStream(pair.getKey());
            buffer = new byte[fileInputStream.available()];
            fileInputStream.read(buffer);
            fileInputStream.close();
            fileOutputStream.write(buffer);
        }
        fileOutputStream.close();

    }
}
