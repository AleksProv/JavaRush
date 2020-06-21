package jborn.s03;
/*
Из консоли вводится предложение. Определить ошибся ли автор в написании "Жи/Ши пиши с буквой и".
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task10 {
    public static void main (String[] args) throws Exception {
        System.out.println ("Введите предложение");
        String sentence = readString ();
        if (sentence.toUpperCase ().contains ("ЖЫ") || sentence.toUpperCase ().contains ("ШЫ"))
            System.out.println ("ошибка жи/ши");
        else
            System.out.println ("написано правильно");
       }

    public static String readString () throws Exception {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        return reader.readLine ();
    }

}