package javasyntax.level7.lectore_12;

/*
Не компилируется задача про котиков.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution_6 {
    public final static ArrayList<Cat> CATS = new ArrayList<> ();

    public static void main (String[] args) throws Exception {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        while (true) {
            String name =  reader.readLine ();
            if (name == null || name.isEmpty ()) {
                break;
            }
            int age = Integer.parseInt(reader.readLine ());
            int weight = Integer.parseInt (reader.readLine ());
            int tailLength = Integer.parseInt (reader.readLine ());

            Cat cat = new Cat (name,age, weight, tailLength);
            CATS.add (cat);
        }
        printList ();
    }

    public static void printList () {
        for (int i = 0; i < CATS.size (); i++) {
            System.out.println (CATS.get (i));
        }
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int taiLength;

        Cat (String name, int age, int weight, int taiLength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.taiLength = taiLength;
        }

        @Override
        public String toString () {
            return "Cat's name: " + name + ", age: " + age + ", weight: " + weight + ", taiL: " + taiLength;
        }
    }
}