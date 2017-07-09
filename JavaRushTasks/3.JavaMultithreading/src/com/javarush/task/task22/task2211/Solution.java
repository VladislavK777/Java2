package com.javarush.task.task22.task2211;

import java.io.*;
import java.nio.charset.Charset;

/* 
Смена кодировки
*/
public class Solution {
    static String win1251TestString = "РќР°СЂСѓС€РµРЅРёРµ РєРѕРґРёСЂРѕРІРєРё РєРѕРЅСЃРѕР»Рё?"; //only for your testing

    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(args[0]);
        FileOutputStream outputStream = new FileOutputStream(args[1]);
        Charset cp1251 = Charset.forName("Windows-1251");
        Charset utf8 = Charset.forName("UTF-8");
        byte[] buf = new byte[inputStream.available()];
        inputStream.read(buf);
        String s = new String(buf, cp1251);
        buf = s.getBytes(utf8);
        outputStream.write(buf);
        inputStream.close();
        outputStream.close();
    }
}
