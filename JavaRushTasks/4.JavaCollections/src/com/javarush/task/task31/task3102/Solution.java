package com.javarush.task.task31.task3102;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/* 
Находим все файлы
*/
public class Solution {
    public static List<String> getFileTree(String root) throws IOException {
        File rootT = new File(root);
        List<String> list = new ArrayList<>();
        Stack<File> stack = new Stack<>();
        stack.push(rootT);
        while(!stack.isEmpty()) {
            File child = stack.pop();
            if (child.isDirectory()) {
                for(File f : child.listFiles()) stack.push(f);
            } else if (child.isFile()) {
                list.add(child.getPath());
            }
        }
        return list;

    }

    public static void main(String[] args) throws IOException {
        String rootPath = "/Users/vladislavklockov/Desktop/JavaRush/JavaRushTasks/4.JavaCollections/src/com/javarush/task/task31/task3101/";
        List<String> list = getFileTree(rootPath);
        for (String s : list) {
            System.out.println(s);
        }
    }
}
