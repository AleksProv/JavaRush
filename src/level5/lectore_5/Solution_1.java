package level5.lectore_5;

/*
Трикотаж. Создать трех котов.
 */

public class Solution_1 {

    public static void main (String[] args) {
        Cat cat1 = new Cat ("Барсик", 5, 10, 11);
        Cat cat2 = new Cat ("Васька", 1, 3, 7);
        Cat cat3 = new Cat ("Борька", 3, 15, 20);
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat (String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}


