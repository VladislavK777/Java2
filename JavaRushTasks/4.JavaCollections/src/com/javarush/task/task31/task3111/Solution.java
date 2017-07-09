package com.javarush.task.task31.task3111;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/* 
Продвинутый поиск файлов
*/
public class Solution {

    public static void main(String[] args) throws IOException {
        SearchFileVisitor searchFileVisitor = new SearchFileVisitor();

        searchFileVisitor.setPartOfName("second");
        searchFileVisitor.setPartOfContent("1");
        searchFileVisitor.setMinSize(10);
        searchFileVisitor.setMaxSize(50);



        Files.walkFileTree(Paths.get("/Users/vladislavklockov/Desktop/JavaRush/JavaRushTasks/4.JavaCollections/src/com/javarush/task/task31/task3101/test"), searchFileVisitor);

        List<Path> foundFiles = searchFileVisitor.getFoundFiles();
        for (Path file : foundFiles) {
            System.out.println(file);
        }
    }

}
