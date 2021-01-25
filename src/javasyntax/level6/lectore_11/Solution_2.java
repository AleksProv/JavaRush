package javasyntax.level6.lectore_11;

/*
Блокнот для новых идей.
 */

public class Solution_2 {

    public static void main(String[] args) {
        printIdea(new Idea());
    }

    public static void printIdea(Idea idea) {
        System.out.println(idea.getDescription ());
    }

    public static class Idea {
        public String getDescription() {
             return "Блокнот для новых идей";
        }
    }

}

