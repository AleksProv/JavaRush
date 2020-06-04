package level6.lectore_11;

/*
Кот и статика.
 */

public class Solution {
    public static void main(String[] args) {
        while (Cat.catCount < 10) {
            Cat cat = new Cat();
        }
        System.out.println(Cat.catCount);
    }

    public static class Cat {
        public static int catCount = 0;

        public Cat() {
            catCount++;
        }
    }
}