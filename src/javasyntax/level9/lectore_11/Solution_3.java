package javasyntax.level9.lectore_11;
/*
Метод в try..catch
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution_3 {
    public static void main (String[] args) {
        readData ();
    }

    public static void readData () {
        List<Integer> list = new ArrayList<> ();
        try {
            BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
            while (true) {
                list.add (Integer.parseInt (reader.readLine ()));
            }
        } catch (NumberFormatException | IOException e) {
            for (Integer num: list ) {
                System.out.println (num);
            }
        }
    }
}