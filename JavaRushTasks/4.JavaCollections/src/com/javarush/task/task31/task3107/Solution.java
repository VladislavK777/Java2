package com.javarush.task.task31.task3107;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


/*
Null Object Pattern
*/
public class Solution {
    private FileData fileData;

    public Solution(String pathToFile) {
        try {
            boolean isHidden = Files.isHidden(Paths.get(pathToFile));
            boolean isExecuter = Files.isExecutable(Paths.get(pathToFile));
            boolean isDirectory = Files.isDirectory(Paths.get(pathToFile));
            boolean isWritable = Files.isWritable(Paths.get(pathToFile));
            fileData = new ConcreteFileData(isHidden, isExecuter, isDirectory, isWritable);
        } catch (Exception e) {
            fileData = new NullFileData(e);
        }
    }

    public FileData getFileData() {
        return fileData;
    }
}
