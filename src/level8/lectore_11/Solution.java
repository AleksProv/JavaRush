package level8.lectore_11;

/*
Set из котов
 */

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main (String[] args) {
        Set<Cat> cats = createCats ();
        for (Cat item : cats) {
            cats.remove (item);
            break;
        }
        printCats (cats);
    }

    public static Set<Cat> createCats () {
        Set<Cat> cats = new HashSet<> ();
        cats.add (new Cat ());
        cats.add (new Cat ());
        cats.add (new Cat ());
        return cats;
    }

    public static void printCats (Set<Cat> cats) {
        for (Cat elem : cats) {
            System.out.println (elem);
        }
    }

    public static class Cat {
    }
}