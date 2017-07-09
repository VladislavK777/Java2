package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        String productName;
        String price;
        String quantity;
        switch (args[0]) {
            case "-c" : {
                productName = args[1];
                if (args.length > 4) {
                    for (int i = 2; i < args.length-2; i++) {
                        productName += " " + args[i];
                    }
                }
                price = args[args.length-2];
                quantity = args[args.length-1];
                AddProduct(productName, price, quantity, fileName);
                break;
            }
        }
    }

    private static void AddProduct(String productName, String price, String quantity, String fileName) throws IOException {
        Long id = GetMaxId(fileName) +1;
        String fina;
        fina = "\r\n"+ String.format("%-8d%-30s%-8s%-4s", id, productName, price, quantity);
        System.out.println(fina);
        FileInputStream file1 = new FileInputStream(fileName);
        byte[] d1 = new byte[file1.available()-1];
        file1.read(d1);
        file1.close();

        FileOutputStream file = new FileOutputStream(fileName);
        file.write(d1);
        file.write(fina.getBytes());
        file.close();
    }

    private static long GetMaxId(String fileName) throws IOException {
        BufferedReader file = new BufferedReader(new FileReader(fileName));
        long maxId = 0;
        String line;
        while ((line = file.readLine()) != null) {
            line = line.split(" ")[0];
            if (line.length()>8) {
                line = line.substring(0, 8);}
            long iD = Long.parseLong(line.trim());
            if (iD > maxId) {
                maxId = iD;
            }
        }
        file.close();
        return maxId;
    }
}
