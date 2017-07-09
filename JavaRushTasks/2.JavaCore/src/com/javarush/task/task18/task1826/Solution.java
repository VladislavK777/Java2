package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(args[1]);
        FileOutputStream fileOutputStream = new FileOutputStream(args[2]);
        int[] charArray = new int[fileInputStream.available()];
        byte[] buffer = new byte[fileInputStream.available()];
        byte[] byteArray = new byte[fileInputStream.available()];
        switch (args[0]) {
            case "-e":
                fileInputStream.read(buffer);
                for (int i = 0; i < buffer.length; i++) {
                    charArray[i] = Integer.valueOf(buffer[i] + 1);
                }
                for (int i = 0; i < charArray.length; i++) {
                    byteArray[i] = (byte) charArray[i];
                    //System.out.println(charArray[i]);
                }
                /*for (int i = 0; i < byteArray.length; i++) {
                    System.out.println(byteArray[i]);
                }*/
                fileOutputStream.write(byteArray);
                fileInputStream.close();
                fileOutputStream.close();
                break;
            case "-d":
                fileInputStream.read(buffer);
                for (int i = 0; i < buffer.length; i++) {
                    charArray[i] = Integer.valueOf(buffer[i] - 1);
                }
                for (int i = 0; i < charArray.length; i++) {
                    byteArray[i] = (byte) charArray[i];
                    //System.out.println(charArray[i]);
                }
                /*for (int i = 0; i < byteArray.length; i++) {
                    System.out.println(byteArray[i]);
                }*/
                fileOutputStream.write(byteArray);
                fileInputStream.close();
                fileOutputStream.close();
                break;
        }

    }

}
