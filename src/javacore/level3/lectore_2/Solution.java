package javacore.level3.lectore_2;
/*
Баг в initializeIdAndName
 */

public class Solution {
    public static void main(String[] args) {
        System.out.println(Matrix.NEO);
        System.out.println(Matrix.TRINITY);
    }

    static class Matrix {
        public static DBObject NEO = new User().initializeIdAndName(1, "NEO");
        public static DBObject TRINITY = new User().initializeIdAndName(2, "Trinity");
    }


    interface DBObject {
        DBObject initializeIdAndName(long id, String name);
    }

    static class User implements DBObject {
        long id;
        String name;

        @Override
        public User initializeIdAndName(long id, String name) {
            this.id = id;
            this.name = name;
            return this;
        }

        @Override
        public String toString() {
            return String.format("The user's name iz %s, id = %d", name, id);
        }
    }
}