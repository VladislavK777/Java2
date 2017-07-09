package com.javarush.task.task22.task2202;

import com.sun.org.apache.xalan.internal.xsltc.dom.SimpleResultTreeImpl;

/*
Найти подстроку
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }

    public static String getPartOfString(String string) throws TooShortStringException {
        if (string == null || string.isEmpty()) throw new TooShortStringException();
        int findSpace = string.indexOf(" ");
        for (int i = 1; i < 4; i++) {
            if ((findSpace = string.indexOf(" ", findSpace + 1)) == -1)
                throw new TooShortStringException();
        }
        String s[] = string.split(" ");
        return s[1] + " " + s[2] + " " + s[3] + " " +  s[4];
    }

    public static class TooShortStringException extends RuntimeException{
    }


}
