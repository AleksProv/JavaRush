package javacore.level7.lectore_10.crud;

/*
CRUD
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Solution {
    public static List<Person> allPeople = new ArrayList<>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));
        allPeople.add(Person.createMale("Петров Петр", new Date()));
    }

    public static void main(String[] args) throws ParseException {
//        args = new String[]{"-c", "Миронов", "м", "15/04/1990"};

        switch (args[0]) {
            case "-c":
                addPeople(args);
                break;
            case "-i":
                printPeople(args);
                break;
            case "-u":
                updatePeople(args);
                break;
            case "-d":
                deletPeople(args);
                break;
        }
    }

    public static void addPeople(String[] args) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date personDate = format.parse(args[3]);
        if (args[2].equals("м"))
            allPeople.add(Person.createMale(args[1], personDate));
        else
            allPeople.add(Person.createFemale(args[1], personDate));
        System.out.println(allPeople.size() - 1);
    }

    public static void printPeople(String[] args) {
        SimpleDateFormat inputFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        Person person = allPeople.get(Integer.parseInt(args[1]));
        String namePerson = person.getName();
        String pol = person.getSex().equals(Sex.MALE) ? "м" : "ж";
        Date datePerson = person.getBirthDate();
        String datePeople = inputFormat.format(datePerson);
        System.out.println(namePerson + " " + pol + " " + datePeople);
    }

    public static void updatePeople(String[] args) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date personDate = format.parse(args[4]);
        Person person = allPeople.get(Integer.parseInt(args[1]));
        person.setName(args[2]);
        person.setSex(args[3].equals("м") ? Sex.MALE : Sex.FEMALE);
        person.setBirthDate(personDate);
        allPeople.set(Integer.parseInt(args[1]), person);
    }

    public static void deletPeople(String[] args) {
        Person person = allPeople.get(Integer.parseInt(args[1]));
        person.setName(null);
        person.setBirthDate(null);
        person.setSex(null);
        allPeople.set(Integer.parseInt(args[1]), person);
    }

}