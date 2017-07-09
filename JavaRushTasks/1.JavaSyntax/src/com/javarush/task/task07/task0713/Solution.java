package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 20; i++) {
            int a = Integer.parseInt(reader.readLine());
            arrayList.add(a);
        }

        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 3 == 0) {
                list1.add(arrayList.get(i));
            }
            if (arrayList.get(i) % 2 == 0) {
                list2.add(arrayList.get(i));
            }
            if (arrayList.get(i) % 3 != 0 && arrayList.get(i) % 2 != 0) {
                list3.add(arrayList.get(i));
            }
        }
        printList(list1);
        printList(list2);
        printList(list3);
    }

    public static void printList(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
