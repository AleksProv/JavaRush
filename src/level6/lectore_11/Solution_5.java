package level6.lectore_11;

/*
Родственные связи кошек.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_5 {
    public static void main (String[] args) throws Exception {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));

        String dedName = reader.readLine ();
        Cat catDed = new Cat (dedName);

        String babName = reader.readLine ();
        Cat catBaba = new Cat (babName);

        String fatherName = reader.readLine ();
        Cat catFather = new Cat (fatherName, null, catDed);

        String motherName = reader.readLine ();
        Cat catMother = new Cat (motherName, catBaba, null);

        String sonName = reader.readLine ();
        Cat catSon = new Cat (sonName, catMother, catFather);

        String daughterName = reader.readLine ();
        Cat catDaughter = new Cat (daughterName, catMother, catFather);


        System.out.println (catDed);
        System.out.println (catBaba);
        System.out.println (catFather);
        System.out.println (catMother);
        System.out.println (catSon);
        System.out.println (catDaughter);

    }

    public static class Cat {
        private String name;
        private Cat mother;
        private Cat father;

        Cat (String name) {
            this.name = name;
        }


        Cat (String name, Cat mother, Cat father) {
            this.name = name;
            this.mother = mother;
            this.father = father;
        }

        @Override
        public String toString () {
            if (mother == null && father == null)
                return "The cat's name is " + name + ", no mother " + ", no father ";
            else if (father == null)
                return "The cat's name is " + name + ", mother is " + mother.name + ", no father ";
            else if (mother == null)
                return "The cat's name is " + name + ", no mother " + ", father is " + father.name;
            else
                return "The cat's name is " + name + ", mother is " + mother.name + ", father is " + father.name;
        }
    }
}