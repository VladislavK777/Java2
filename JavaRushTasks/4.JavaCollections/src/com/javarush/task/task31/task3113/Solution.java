package com.javarush.task.task31.task3113;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

/* 
Что внутри папки?
*/
public class Solution {
    public static void main(final String[] args) throws IOException {
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        final String strDir = reader.readLine();

        final Path dir = Paths.get(strDir);
        if (!Files.isDirectory(dir)) {
            System.out.println(strDir + " - не папка");
            return;
        }

        final long[] countFoldersFilesTotalSize = {-1, 0, 0};
        Files.walkFileTree(dir, new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult preVisitDirectory(final Path folder, final BasicFileAttributes attrs) throws IOException {
                countFoldersFilesTotalSize[0] += 1;
                return super.preVisitDirectory(folder, attrs);
            }

            @Override
            public FileVisitResult visitFile(final Path file, final BasicFileAttributes attrs) throws IOException {
                countFoldersFilesTotalSize[1] += 1;
                countFoldersFilesTotalSize[2] += Files.size(file);
                return super.visitFile(file, attrs);
            }
        });

        System.out.println("Всего папок - " + countFoldersFilesTotalSize[0]);
        System.out.println("Всего файлов - " + countFoldersFilesTotalSize[1]);
        System.out.println("Общий размер - " + countFoldersFilesTotalSize[2]);
    }
}


///Users/vladislavklockov/Desktop/JavaRush/JavaRushTasks/4.JavaCollections/src/com/javarush/task/task31/task3101