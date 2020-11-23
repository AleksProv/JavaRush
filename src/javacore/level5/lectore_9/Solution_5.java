package javacore.level5.lectore_9;

/*
Статики и котики
 */

public class Solution_5 {
    public static Cat cat;

    static {
        Cat catTip = new Cat();
        catTip.name = "Kot";
        Solution_5.cat = catTip;
        System.out.println(cat.name);
    }

    public static void main(String[] args) {
    }

    public static class Cat {
        public String name;
    }
}
