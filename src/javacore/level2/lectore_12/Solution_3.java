package javacore.level2.lectore_12;

/*
То ли птица, то ли лампа
 */

public class Solution_3 {
    public static void main(String[] args) {
        printObjectType(new Cat());
    }

    public static void printObjectType(Object o){
        if (o instanceof Cat)
            System.out.println("Кошка");
    }

    public static class Cat{}
}