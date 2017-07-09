package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human grandmother1 = new Human("Jinna", false, 55);
        Human grandmother2 = new Human("Irina", false,58);
        Human grandfather1 = new Human("Grag", true, 59);
        Human grandfather2 = new Human("Max", true,59);
        Human mother = new Human("Kate", false,28, grandfather1, grandmother1);
        Human father = new Human("Sam", true, 31, grandfather2, grandmother2);
        Human sun1 = new Human("Kola", true, 3, father, mother);
        Human dat1 = new Human("Liza", false,2, father, mother);
        Human sun2 = new Human("Bill", true,2, father, mother);
        System.out.println(grandmother1.toString());
        System.out.println(grandfather1.toString());
        System.out.println(grandmother2.toString());
        System.out.println(grandfather2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(sun1.toString());
        System.out.println(dat1.toString());
        System.out.println(sun2.toString());
        //напишите тут ваш код
    }

    public static class Human {
        private String name;
        private int age;
        private boolean sex;
        private Human father;
        private Human mother;

        public Human(String n, boolean s, int a) {
            this.name = n;
            this.age = a;
            this.sex = s;
        }

        public Human(String n, boolean s, int a, Human f, Human m) {
            this.name = n;
            this.age = a;
            this.sex = s;
            this.father = f;
            this.mother = m;
        }
        //напишите тут ваш код

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















