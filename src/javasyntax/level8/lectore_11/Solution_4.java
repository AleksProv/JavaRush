package javasyntax.level8.lectore_11;
/*
минимальное из N чисел
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution_4 {
    public static void main (String[] args) throws Exception {
        List<Integer> integerList = getIntegerList ();
        System.out.println (getMinimum (integerList));
    }

    public static int getMinimum (List<Integer> array) {
        int min = array.get (0);
        for (int i = 0; i < array.size (); i++) {
            if (array.get (i) <= min)
                min = array.get (i);
        }
        return min;
    }

    public static List<Integer> getIntegerList () throws Exception {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        int N = Integer.parseInt(reader.readLine ());
        List<Integer> integerList = new ArrayList<> ();
        for (int i = 0; i < N; i++) {
            integerList.add (Integer.parseInt (reader.readLine ()));
        }
        return integerList;
    }
}
