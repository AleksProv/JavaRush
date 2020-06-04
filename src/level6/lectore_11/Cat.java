package level6.lectore_11;

/*
Статические коты.
 */

import java.util.ArrayList;

public class Cat {
    public static ArrayList<Cat> cats = new ArrayList<>();

    public Cat() {
        }

    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 10; i++) {
            Cat.cats.add(new Cat());
        }
        printCats();
    }

    public static void printCats() {
        for (Cat catsPrint : cats) {
            System.out.println(catsPrint);
        }
    }
}
