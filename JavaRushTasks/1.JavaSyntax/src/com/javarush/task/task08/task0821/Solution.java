package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("a1", "b1");
        map.put("a2", "b2");
        map.put("a3", "b3");
        map.put("a1", "b4");
        map.put("a4", "b1");
        map.put("a5", "b5");
        map.put("a5", "b5");
        map.put("a6", "b6");
        map.put("a7", "b7");
        map.put("a8", "b1");

        //напишите тут ваш код

        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
