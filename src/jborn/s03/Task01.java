package jborn.s03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task01 {
    public static void main(String[] args) throws Exception {
        System.out.println("Введите название гоусдарства");
        String nameGos = readString();
        System.out.println("Введите название столицы");
        String nameCity = readString();
        System.out.println("Столица государства " + nameGos + " - город " + nameCity);
    }

    public static String readString() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }

}