package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Знакомство с properties
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();

    public void fillInPropertiesMap() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        load(fileInputStream);
        reader.close();
        //implement this method - реализуйте этот метод
    }

    public void save(OutputStream outputStream) throws Exception {
        Properties myproperties = new Properties();
        for (Map.Entry p : properties.entrySet()) {
            myproperties.setProperty(p.getKey().toString(), p.getValue().toString());
        }
        myproperties.store(outputStream, "Конфиг");
        outputStream.close();
        //implement this method - реализуйте этот метод
    }

    public void load(InputStream inputStream) throws Exception {
        Properties myProperties = new Properties();
        myProperties.load(inputStream);
        properties.clear();
        for (Map.Entry e : myProperties.entrySet()){
            properties.put(e.getKey().toString(), e.getValue().toString());
        }
        inputStream.close();
        //implement this method - реализуйте этот метод
    }

    public static void main(String[] args) throws Exception {

    }
}
///Users/vladislavklockov/Desktop/JavaRush/JavaRushTasks/2.JavaCore/src/com/javarush/task/task20/task2003/test1.txt