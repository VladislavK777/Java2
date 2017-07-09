package com.javarush.task.task31.task3105;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/* 
Добавление файла в архив
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        String zipFile = args[1];
        Map<ZipEntry, StringBuffer> map = new HashMap<>();
        try (ZipInputStream zis = new ZipInputStream(new FileInputStream(zipFile));) {
            ZipEntry entry;
            int i;
            while ((entry = zis.getNextEntry()) != null) {
                StringBuffer sb = new StringBuffer();
                while ((i = zis.read()) != -1) {
                    sb.append((char) i);
                }
                map.put(entry, sb);
            }
            File file = new File(fileName);
            try (ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(zipFile));) {
                zos.putNextEntry(new ZipEntry("new/" + file.getName()));
                Files.copy(file.toPath(), zos);
                for (Map.Entry<ZipEntry, StringBuffer> pair : map.entrySet()) {
                    if (!pair.getKey().getName().equals(file.getName())) {
                        zos.putNextEntry(pair.getKey());
                        for (char c : pair.getValue().toString().toCharArray()) {
                            zos.write(c);
                        }
                    } else {
                        zos.putNextEntry(new ZipEntry(pair.getKey().getName()));
                        Files.copy(file.toPath(), zos);
                    }
                }
                zis.close();
                zos.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
