package jborn.s03;
/*
Транслитиратор.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task11 {
    public static void main (String[] args) throws Exception {
        char[] ciril = {' ', '.', ',', 'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я', 'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж', 'З', 'И', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р', 'С', 'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Ъ', 'Ы', 'Ь', 'Э', 'Ю', 'Я'};
        String[] latin = {" ", ".", ",", "a", "b", "v", "g", "d", "e", "e", "zh", "z", "i", "y", "k", "l", "m", "n", "o", "p", "r", "s", "t", "u", "f", "h", "ts", "ch", "sh", "sch", "", "i", "", "e", "ju", "ja", "A", "B", "V", "G", "D", "E", "E", "Zh", "Z", "I", "Y", "K", "L", "M", "N", "O", "P", "R", "S", "T", "U", "F", "H", "Ts", "Ch", "Sh", "Sch", "", "I", "", "E", "Ju", "Ja"};
        StringBuilder str = new StringBuilder ();
        System.out.println ("Введите текст");
        String sentence = readString ();
        for (int i = 0; i < sentence.length (); i++) {
            for (int j = 0; j < ciril.length; j++) {
                if (sentence.charAt (i) == ciril[j]) {
                    str.append (latin[j]);
                    break;
                }
            }
        }
        System.out.println (str.toString ());
    }

    public static String readString () throws Exception {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        return reader.readLine ();
    }

}