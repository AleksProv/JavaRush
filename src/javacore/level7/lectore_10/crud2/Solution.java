package javacore.level7.lectore_10.crud2;

/*
CRUD2
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Solution {
    public static final List<Person> allPeople = new ArrayList<>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));
        allPeople.add(Person.createMale("Петров Петр", new Date()));
    }

    public static void main(String[] args) throws ParseException {
        //    args = new String[]{"-c", "Миронов", "м", "15/04/1990", "Аронова", "ж", "15/05/1995"};
        //    args = new String[]{"-i", "0", "1"};

        switch (args[0]) {
            case "-c":
                synchronized (allPeople) {
                    addPeople(args);
                    break;
                }
            case "-i":
                synchronized (allPeople) {
                    printPeople(args);
                    break;
                }
            case "-u":
                synchronized (allPeople) {
                    updatePeople(args);
                    break;
                }
            case "-d":
                synchronized (allPeople) {
                    deletPeople(args);
                    break;
                }
        }
    }


    public static void addPeople(String[] args) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        for (int i = 1; i < args.length; ) {
            Date personDate = format.parse(args[i + 2]);
            if (args[i + 1].equals("м"))
                allPeople.add(Person.createMale(args[i], personDate));
            else
                allPeople.add(Person.createFemale(args[i], personDate));
            System.out.println(allPeople.size() - 1);
            i += 3;
        }
    }

    public static void printPeople(String[] args) {
        for (int i = 1; i < args.length; i++) {
            SimpleDateFormat inputFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
            Person person = allPeople.get(Integer.parseInt(args[i]));
            String namePerson = person.getName();
            String pol = person.getSex().equals(Sex.MALE) ? "м" : "ж";
            Date datePerson = person.getBirthDate();
            String datePeople = inputFormat.format(datePerson);
            System.out.println(namePerson + " " + pol + " " + datePeople);
        }
    }

    public static void updatePeople(String[] args) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        for (int i = 1; i < args.length; ) {
            Date personDate = format.parse(args[i + 3]);
            Person person = allPeople.get(Integer.parseInt(args[i]));
            person.setName(args[i + 1]);
            person.setSex(args[i + 2].equals("м") ? Sex.MALE : Sex.FEMALE);
            person.setBirthDate(personDate);
            allPeople.set(Integer.parseInt(args[i]), person);
            i += 4;
        }
    }

    public static void deletPeople(String[] args) {
        for (int i = 1; i < args.length; i++) {
            Person person = allPeople.get(Integer.parseInt(args[i]));
            person.setName(null);
            person.setBirthDate(null);
            person.setSex(null);
            allPeople.set(Integer.parseInt(args[i]), person);
        }
    }

}