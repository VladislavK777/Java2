package com.javarush.task.task07.task0707;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList< String > list = new ArrayList < String > ();
        list.add("sdsdsd");
        list.add("sdsd");
        list.add("sdddsdsd");
        list.add("sdsdsddddd");
        list.add("sdsdd");
        System.out.println(list.size());
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
