package javacore.level9.lectore_11.huan;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Хуан Хуанович
 * В метод main первым параметром приходит имя файла.
 * В этом файле каждая строка имеет следующий вид:
 * имя день месяц год где [имя] - может состоять из нескольких слов, разделенных пробелами, и имеет тип String.
 * [день] - int, [месяц] - int, [год] - int данные разделены пробелами. Заполнить список PEOPLE.
 */

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<>();

    public static void main(String[] args) {
        args = new String[]{"d:/huan.txt"};
        String fileName = args[0];
        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
            while (fileReader.ready()) {
                String[] array = fileReader.readLine().split(" ");
                StringBuilder stringBuilder = new StringBuilder();

                for (int i = 0; i < array.length - 3; i++) {
                    stringBuilder.append(array[i]).append(" ");
                }

                int year = Integer.parseInt(array[array.length - 1]);
                int month = Integer.parseInt(array[array.length - 2]) - 1;  //January ==0
                int day = Integer.parseInt(array[array.length - 3]);

                Calendar calendar = new GregorianCalendar(year, month, day);
                PEOPLE.add(new Person(stringBuilder.toString().trim(), calendar.getTime()));
            }

// 1 вариант
//        String namePerson;
//        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
//            while (fileReader.ready()) {
//                String[] array = fileReader.readLine().split(" ");
//                int[] arrayData = new int[3];
//                int count = 0;
//                namePerson = array[0];
//
//                for (int i = 1; i < array.length; i++) {
//                    if (!isDigit(array[i])) {
//                        namePerson = namePerson + " " + array[i];
//                    } else {
//                        arrayData[count] = Integer.parseInt(array[i]);
//                        count++;
//                    }
//                }
//                Calendar calendar = new GregorianCalendar(arrayData[2], arrayData[1] - 1, arrayData[0]);
//                Date datePerson = calendar.getTime();
//                PEOPLE.add(new Person(namePerson, datePerson));
//            }

            for (Person people : PEOPLE) {
                System.out.println(people.getName() + " " + people.getBirthDate());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
