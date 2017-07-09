package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man man1 = new Man("Vlad", 29, "Moscow");
        Man man2 = new Man ("Pasha", 28, "Vladik");
        Woman woman1 = new Woman("Lilia", 26, "Voronez");
        Woman woman2 = new Woman("Katy", 25, "Moscow");
        System.out.println(man1.name + " " + man1.age + " " + man1.address);
        System.out.println(man2.name + " " + man2.age + " " + man2.address);
        System.out.println(woman1.name + " " + woman1.age + " " + woman1.address);
        System.out.println(woman2.name + " " + woman2.age + " " + woman2.address);
        //напишите тут ваш код
    }

    public static class Man {
        private String name;
        private int age;
        private String address;

        public Man(String n, int a, String ad) {
            name = n;
            age = a;
            address = ad;
        }
    }

    public static class Woman {
        private String name;
        private int age;
        private String address;

        public Woman(String n, int a, String ad) {
            name = n;
            age = a;
            address = ad;
        }
    }
    //напишите тут ваш код
}
