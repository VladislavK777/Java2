package com.javarush.task.task13.task1322;

/* 
Интерфейс SimpleObject
*/

import java.util.Objects;

public class Solution {
    public static void main(String[] args) throws Exception {
        SimpleObject<String> stringObject = new StringObject();
    }

    interface SimpleObject<T> {
        SimpleObject<String> getInstance();
    }

    public static class StringObject implements SimpleObject {
        public SimpleObject<String> getInstance () {
            return null;
        }
    }

}
