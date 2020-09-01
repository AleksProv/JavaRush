package level9.lectore_11;

/*
Гласные и согласные
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_5 {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё', 'й'};

    public static void main (String[] args) throws IOException {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        String stroka = reader.readLine ();
        StringBuilder str1 = new StringBuilder ();
        StringBuilder str2 = new StringBuilder ();
        for (int i = 0; i < stroka.length (); i++) {
            if (!Character.isWhitespace (stroka.charAt (i))) {
                if (isVowel (stroka.charAt (i)))
                    str1.append (stroka.charAt (i)).append (" ");
                else
                    str2.append (stroka.charAt (i)).append (" ");
            }
        }
        System.out.println (str1);
        System.out.println (str2);
    }

    //метод проверяет, гласная ли буква
    public static boolean isVowel (char c) {
        c = Character.toLowerCase (c);
        for (char d : vowels) {
            if (c == d)
                return true;
        }
        return false;
    }
}
