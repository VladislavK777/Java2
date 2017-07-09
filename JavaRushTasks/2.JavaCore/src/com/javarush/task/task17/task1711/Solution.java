package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        Person person = null;
        switch (args[0]) {
            case "-c":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i += 3) {
                        if (args[i + 1].equals("м")) {
                            allPeople.add(Person.createMale(args[i], new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[i + 2])));
                        } else if (args[i + 1].equals("ж")) {
                            allPeople.add(Person.createFemale(args[i], new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[i + 2])));
                        }
                        System.out.println(allPeople.size() - 1);
                    }
                }
                break;
            case "-u":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i += 4) {
                        person = allPeople.get(Integer.parseInt(args[i]));
                        person.setName(args[i + 1]);
                        if (args[i + 2].equals("м")) {
                            person.setSex(Sex.MALE);
                        } else if (args[i + 2].equals("ж")) {
                            person.setSex(Sex.FEMALE);
                        }
                        person.setBirthDay(new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[i + 3]));
                        allPeople.set(Integer.parseInt(args[i]), person);
                    }
                }
                break;
            case "-d":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        person = allPeople.get(Integer.parseInt(args[i]));
                        person.setName(null);
                        person.setSex(null);
                        person.setBirthDay(null);
                        allPeople.set(Integer.parseInt(args[i]), person);
                    }
                }
                break;
            case "-i":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        person = allPeople.get(Integer.parseInt(args[i]));
                        String sex = null;
                        if (person.getSex().equals(Sex.MALE)) {
                            sex = "м";
                        } else if (person.getSex().equals(Sex.FEMALE)) {
                            sex = "ж";
                        }
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-YYYY", Locale.ENGLISH);
                        String date = simpleDateFormat.format(person.getBirthDay());
                        System.out.println(person.getName() + " " + sex + " " + date);
                    }
                }
                break;
        }

        //start here - начни тут
    }
}
