package com.javarush.task.task20.task2025;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
Алгоритмы-числа
*/
public class Solution {
    public static void main(String[] args) {
        long a = System.currentTimeMillis();
        long[] y = getNumbers(Integer.MAX_VALUE);
        long b = System.currentTimeMillis();
        System.out.println("Time: " + (b - a) / 1000 + " seconds " + ((b - a) % 1000) + " ms");
        System.out.println("Memory: " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / 1024 / 1024 + " mb");
        System.out.println(y.length);
        for(long i : y) {
            System.out.print(i + ", ");
        }
    }

    public static long[] getNumbers(long N) {
        // Init power array
        final int NUMBERS = 9;
        final int SQRT = 10;
        int[][] power = new int[NUMBERS + 1][SQRT + 1];
        for(int i = 0; i <= NUMBERS; i++) {
            int temp = i;
            power[i][1] = temp;
            for(int j = 2; j <= SQRT; j++) {
                temp *= i;
                power[i][j] = temp;
            }
        }
        List<Integer> armstrong = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            if(i < 0) break;
            // All 1-digit numbers are armstrong's numbers
            if(i > 9) {
                int n = i;
                int last;
                int prev;
                int degree = 1;
                boolean shouldVerify = true;

                // Verifying that every digit is less or equals next one
                // And calculate digits number
                while(n > 9) {
                    degree++;
                    last = n % 10;
                    n /= 10;
                    prev = n % 10;

                    if(last == 0) {
                        last = 10;
                    }

                    if(prev == 0) {
                        prev = 10;
                    }

                    if(last < prev) {
                        shouldVerify = false;
                        break;
                    }
                }

                if(!shouldVerify)
                    continue;

                // Calculate sum of powered digits
                int m = i;
                int sum = 0;
                while(m > 0) {
                    sum += power[m % 10][degree];
                    m /= 10;
                }

                if(sum == i && !armstrong.contains(sum)) {
                    armstrong.add(i);
                }
                else {
                    // Verify if calculated sum is armstrong number
                    int checksum = 0;
                    int checkdegree = 0;
                    int k = sum;
                    while(k > 0) {
                        checkdegree++;
                        k /= 10;
                    }

                    int l = sum;
                    while(l > 0) {
                        checksum += power[l % 10][checkdegree];
                        l /= 10;
                    }

                    if(sum == checksum && !armstrong.contains(sum)) {
                        armstrong.add(sum);
                    }
                }
            }
            else {
                armstrong.add(i);
            }
        }

        // Convert List with armstrong numbers to array
        long[] result = new long[armstrong.size()];
        for(int i = 0; i < armstrong.size(); i++) {
            result[i] = armstrong.get(i);
        }
        Arrays.sort(result);
        return result;
    }
}
