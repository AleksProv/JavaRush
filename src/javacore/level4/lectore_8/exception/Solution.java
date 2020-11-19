package javacore.level4.lectore_8.exception;

/*
Нашествие исключений
 */

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Exception> exceptions = new ArrayList<>();

    public static void main(String[] args) {
        initExceptions();
        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {
        try {
            float i = 1 / 0;
        } catch (ArithmeticException e) {
            exceptions.add(e);
        }
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int a = Integer.parseInt(reader.readLine());
        } catch (NumberFormatException e) {
            exceptions.add(e);
        } catch (IOException e) {
            exceptions.add(e);
        }
        try {
            String str = "abs";
            System.out.println(str.charAt(7));
        } catch (IndexOutOfBoundsException e) {
            exceptions.add(e);
        }
        try {
            int[] array = {1, 2, 3};
            System.out.println(array[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            exceptions.add(e);
        }
        try {
            Object o = new Float(5.5f);
            Integer i = (Integer) o;
        } catch (ClassCastException e) {
            exceptions.add(e);
        }
        try {
            FileOutputStream stream = new FileOutputStream("c:/read.txt");
            System.out.println(stream);
        } catch (FileNotFoundException e) {
            exceptions.add(e);
        }
        try {
            List<Integer> list = new ArrayList<>();
            list.get(7);
        } catch (IndexOutOfBoundsException e) {
            exceptions.add(e);
        }
        try {
            Solution o = new Solution();
            o.clone();
        } catch (CloneNotSupportedException e) {
            exceptions.add(e);
        }
        try {
            String str = null;
            char[] chars = str.toCharArray();
        } catch (NullPointerException e) {
            exceptions.add(e);
        }
        try {
            URL url = new URL("");
        } catch (MalformedURLException e) {
            exceptions.add(e);
        }
    }
}