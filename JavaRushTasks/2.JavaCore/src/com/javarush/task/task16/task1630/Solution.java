package com.javarush.task.task16.task1630;

import com.sun.prism.shader.DrawSemiRoundRect_ImagePattern_AlphaTest_Loader;

import java.io.*;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;
    static {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //add your code here - добавьте код тут

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        //add your code here - добавьте код тут
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface {
        String fileName;
        String fileContent = "";

        public void setFileName(String fullFileName) {
            this.fileName = fullFileName;
        }

        public String getFileContent() {
            return fileContent.trim();
        }

        public void run() {
            try {
                BufferedReader in = new BufferedReader(new FileReader(this.fileName));
                try {
                    while (in.ready()) {
                        fileContent += in.readLine() + " ";
                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //add your code here - добавьте код тут
}
