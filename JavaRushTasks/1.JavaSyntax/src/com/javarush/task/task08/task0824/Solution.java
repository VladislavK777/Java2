package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList child  = new ArrayList();
        ArrayList child1  = new ArrayList();
        ArrayList child2  = new ArrayList();
        Human sun1 = new Human("Kriss", 4, true);
        child.add(sun1);
        Human sun2 = new Human("Karl", 3, true);
        child.add(sun2);
        Human dat1 = new Human("Kat", 3, false);
        child.add(dat1);
        Human father = new Human("Bill", 28, true, child);
        child1.add(father);
        Human mother = new Human("Grays", 26, false, child);
        child2.add(mother);
        Human grandfather1 = new Human("Jack", 54, true, child1);
        Human grandfather2 = new Human("Bob", 58, true, child2);
        Human grandmother1 = new Human("March", 54, false, child1);
        Human grandmother2 = new Human("Bella", 56, false, child2);
        System.out.println(grandfather1);
        System.out.println(grandfather2);
        System.out.println(grandmother1);
        System.out.println(grandmother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(sun1);
        System.out.println(sun2);
        System.out.println(dat1);

        //напишите тут ваш код
    }

    public static class Human {
        private String name;
        private int age;
        private boolean sex;
        private ArrayList<Human> children = new ArrayList<Human>();

        public Human (String n, int a, boolean s) {
            this.name = n;
            this.age = a;
            this.sex = s;
        }

        public Human (String n, int a, boolean s, ArrayList<Human> human) {
            this.name = n;
            this.age = a;
            this.sex = s;
            for (int i = 0; i < human.size(); i++) {
                this.children.add(human.get(i));
            }

        }
        //напишите тут ваш код

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
