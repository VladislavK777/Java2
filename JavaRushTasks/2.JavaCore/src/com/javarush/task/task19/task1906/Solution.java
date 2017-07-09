package com.javarush.task.task19.task1906;

/* 
Четные байты
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fileReader = new FileReader(reader.readLine());
        FileWriter writer = new FileWriter(reader.readLine());
        int count = 0;
        while (fileReader.ready()) {
            int d = fileReader.read();
            count++;
            if (count % 2 == 0) {
                writer.write(d);
            }

        }
        fileReader.close();
        reader.close();
        writer.close();
    }
}

///Users/vladislavklockov/Desktop/JavaRush/JavaRushTasks/2.JavaCore/src/com/javarush/task/task19/task1906/test1.txt
