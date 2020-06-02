package level5.lectore_5;

/*
Создать трех котов и провести три боя попарно.
 */

public class Solution_2 {
    public static void main (String[] args) {
        Cat cat1 = new Cat ("Барсик", 5, 10, 11);
        Cat cat2 = new Cat ("Васька", 1, 3, 7);
        Cat cat3 = new Cat ("Борька", 3, 15, 20);
        System.out.println (cat1.fight (cat2));
        System.out.println (cat2.fight (cat1));
        System.out.println (cat3.fight (cat1));

    }

    protected static class Cat {
        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat (String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight (Cat anotherCat) {
            int ageScore = Integer.compare (this.age, anotherCat.age);
            int weihtScore = Integer.compare (this.weight, anotherCat.weight);
            int strengthScore = Integer.compare (this.strength, anotherCat.strength);
            int score = ageScore + weihtScore + strengthScore;
            return score > 0;
        }
    }
}
