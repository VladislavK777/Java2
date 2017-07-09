package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.*;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader fr = new BufferedReader(new FileReader(args[0]));
        Map< String, Double> map = new TreeMap<>();

        while (fr.ready()){
            String[] s = fr.readLine().split(" ");
            Double d = 0d;
            if (map.get(s[0]) != null) {
                d = map.get(s[0]) + Double.parseDouble(s[1]);
            } else d = Double.parseDouble(s[1]);
            map.put(s[0], d);
        }
        fr.close();

        Double maxPrice = Collections.max(map.values());

        for (Map.Entry< String, Double> pair : map.entrySet()){
            if (pair.getValue().equals(maxPrice))System.out.println(pair.getKey());
        }

    }
}

///Users/vladislavklockov/Desktop/JavaRush/JavaRushTasks/2.JavaCore/src/com/javarush/task/task19/task1920/test1.txt
