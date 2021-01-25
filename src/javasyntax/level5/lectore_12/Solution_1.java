package javasyntax.level5.lectore_12;

/*
Мужчина и женщина.
 */

public class Solution_1 {
    public static void main (String[] args) {
        Man man1 = new Man ("Ivan", 22, "Street 1");
        Man man2 = new Man ("Petr", 32, "Street 2");
        Woman woman1 = new Woman ("Dasha", 20, "Street 3");
        Woman woman2 = new Woman ("Poly", 17, "Street 4");
        System.out.println (man1.name + " " + man1.age + " " + man1.address);
        System.out.println (man2.name + " " + man2.age + " " + man2.address);
        System.out.println (woman1.name + " " + woman1.age + " " + woman1.address);
        System.out.println (woman2.name + " " + woman2.age + " " + woman2.address);
    }

    public static class Man {
        String name;
        int age;
        String address;

        public Man (String name) {
            this.name = name;
        }

        public Man (String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Man (String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

    public static class Woman {
        String name;
        int age;
        String address;

        public Woman (String name) {
            this.name = name;
        }

        public Woman (String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Woman (String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
}
