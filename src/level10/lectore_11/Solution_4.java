package level10.lectore_11;

/*
Массив списков строк
 */


import java.util.ArrayList;

public class Solution_4 {
    public static void main (String[] args) {
        ArrayList<String>[] arrayOfStringList = createList ();
        printList (arrayOfStringList);
    }

    public static ArrayList<String>[] createList ()  {
        ArrayList<String>[] result = new ArrayList[3];

        result[0] = new ArrayList<> ();
        result[1] = new ArrayList<> ();
        result[2] = new ArrayList<> ();

        result[0].add ("Первый");
        result[1].add ("Второй");
        result[2].add ("Третий");

        return result;
    }

    public static void printList (ArrayList<String>[] arrayLists) {
        for (ArrayList<String> list : arrayLists) {
            for (String string : list) {
                System.out.println (string);
            }
        }
    }
}
