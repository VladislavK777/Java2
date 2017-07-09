package com.javarush.task.task31.task3109;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Properties;

/* 
Читаем конфиги
*/
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Properties properties = solution.getProperties("/Users/vladislavklockov/Desktop/JavaRush/JavaRushTasks/4.JavaCollections/src/com/javarush/task/task31/task3109/properties.xml");
        properties.list(System.out);

        properties = solution.getProperties("/Users/vladislavklockov/Desktop/JavaRush/JavaRushTasks/4.JavaCollections/src/com/javarush/task/task31/task3109/properties.txt");
        properties.list(System.out);

        properties = solution.getProperties("/Users/vladislavklockov/Desktop/JavaRush/JavaRushTasks/4.JavaCollections/src/com/javarush/task/task31/task3109/notExists");
        properties.list(System.out);
    }

    public Properties getProperties(String fileName) {
       // String tmp = "/Users/vladislavklockov/Desktop/JavaRush/JavaRushTasks/4.JavaCollections" + File.separator + fileName;
        File file = new File(fileName);
        Properties properties = new Properties();
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            properties.loadFromXML(fileInputStream);
            fileInputStream.close();
        } catch (Exception e) {
            try {
                FileReader fileReader = new FileReader(file);
                properties.load(fileReader);
                fileReader.close();
            } catch (Exception e1) {
                return properties;
            }
        }
        return properties;
    }
}
