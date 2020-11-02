package level10.lectore_11;

/*
Количество букв
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_2 {
    public static void main (String[] args) throws Exception {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));


        // Алфавит
        List<Character> alphabet = Arrays.asList (
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

        //Ввод строк
        ArrayList<String> list = new ArrayList<> ();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine ();
            list.add (s.toLowerCase ());
        }

        int count = 0;
        String text = "";
        for (int i = 0; i < list.size (); i++) {
            text = text + list.get (i);
        }

        for (int i = 0; i < alphabet.size (); i++) {
            for (int j = 0; j < text.length (); j++) {
                if (alphabet.get (i).equals (text.charAt (j))) {
                    count++;
                }
            }
            System.out.println (alphabet.get (i) + " " + count);
            count = 0;
        }
    }
}