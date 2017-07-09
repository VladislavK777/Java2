package com.javarush.task.task18.task1823;

import org.omg.CORBA.INTERNAL;

import java.io.*;
import java.util.*;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName;

        while (true){
            fileName = reader.readLine();
            if ("exit".equals(fileName))
                break;
            else
                new ReadThread(fileName).start();
        }
    }

    public static class ReadThread extends Thread {
        private String fileName;
        public ReadThread(String fileName) {
            try {
                this.fileName = fileName;
                fileInputStream = new FileInputStream(fileName);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            //implement constructor body
        }
        FileInputStream fileInputStream;
        public void run() {
            try {
                Map<Byte, Integer> map = new TreeMap<Byte, Integer>();
                byte[] buffer = new byte[fileInputStream.available()];
                while (fileInputStream.available() > 0) {
                    fileInputStream.read(buffer);
                }
                for (int i = 0; i < buffer.length; i++) {
                    int count = 0;
                    for (int j = 0; j < buffer.length; j++) {
                        if (buffer[i] == buffer[j]) {
                            count++;
                        }
                    }
                    map.put(buffer[i], count);
                    fileInputStream.close();
                }
                HashMap.Entry<Byte, Integer> firstEntry = (Map.Entry<Byte, Integer>) map.entrySet()
                        .stream().sorted(Map.Entry.<Byte, Integer>comparingByValue()
                                .reversed()).iterator().next();
                int firstPhrase = firstEntry.getKey();
                //System.out.println(firstPhrase);
                resultMap.put(fileName, firstPhrase);
                for (Map.Entry<String, Integer> p : resultMap.entrySet()) {
                    System.out.println(p.getKey() + " " + p.getValue());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // implement file reading here - реализуйте чтение из файла тут
    }
}
