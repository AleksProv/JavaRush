package level8.lectore_6;

/*
Самая длинная последовательность. Какое число и сколько раз.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_6 {
    public static void main (String[] args) throws Exception {
        int maxInt = 0;
        int currentCounter = 0;
        int maxCounter = 0;
        int currentInt = -1;
        List<Integer> list = new ArrayList<> ();
        for (int i = 0; i < 5; i++) {
            list.add (Integer.parseInt (readString ()));
        }
        for (Integer elem : list) {
            if (elem == currentInt)
                currentCounter++;
            else {
                if (currentCounter >= maxCounter && currentCounter != 0) {
                    maxCounter = currentCounter;
                    currentCounter = 0;
                    maxInt = currentInt;
                } else if (currentCounter < maxCounter) {
                    currentCounter = 0;
                }
                currentInt = elem;
            }
        }
        if (currentCounter >= maxCounter) {
            maxCounter = currentCounter;
            maxInt = currentInt;
        }
        System.out.println (maxInt + " " + ++maxCounter);
    }

    public static String readString () throws Exception {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        return reader.readLine ();
    }
}