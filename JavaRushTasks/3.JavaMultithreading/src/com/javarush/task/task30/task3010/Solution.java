package com.javarush.task.task30.task3010;

/* 
Минимальное допустимое основание системы счисления
*/

import java.math.BigDecimal;
import java.math.BigInteger;

public class Solution {
    public static void main(String[] args) {
    boolean isCheked = true;
            for (int i = 2; i <= 36; i++) {
                try {
                BigDecimal bigDecimal = new BigDecimal(new BigInteger(args[0], i));
                System.out.println(i);
                isCheked = false;
                break;
                } catch (Exception e) {

                }
            }
            if (isCheked) {
                System.out.println("incorrect");
            }
        //напишите тут ваш код
    }
}