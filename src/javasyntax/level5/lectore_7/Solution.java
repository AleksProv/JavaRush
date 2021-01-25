package javasyntax.level5.lectore_7;

/*
Программист создает человека. Создать класс Person и проинициализировать его
 */

public class Solution {
    public static void main (String[] args) {
        Person person = new Person ();
        person.initialize ("Человек", 25);
    }

    static class Person {
        String name;
        int age;

        public void initialize (String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}