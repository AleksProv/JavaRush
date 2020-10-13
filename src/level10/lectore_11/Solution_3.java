package level10.lectore_11;
/*
Конструкторы класса Human
 */

public class Solution_3 {
    public static void main (String[] args) {
    }

    public static class Human {
        private String name;
        private String pol;
        private String adress;
        private int weigh;
        private int heigh;
        private int age;

        public Human (String name) {
            this.name = name;
        }

        public Human (String name, String pol) {
            this.name = name;
            this.pol = pol;
        }

        public Human (String name, String pol, String adress) {
            this.name = name;
            this.pol = pol;
            this.adress = adress;
        }

        public Human (String name, String pol, String adress, int weigh) {
            this.name = name;
            this.pol = pol;
            this.adress = adress;
            this.weigh = weigh;
        }

        public Human (String name, String pol, String adress, int weigh, int heigh) {
            this.name = name;
            this.pol = pol;
            this.adress = adress;
            this.weigh = weigh;
            this.heigh = heigh;
        }

        public Human (String name,  int age) {
            this.name = name;
            this.age = age;
        }

        public Human (String name,  int heigh, int age) {
            this.name = name;
            this.heigh = heigh;
            this.age = age;
        }

        public Human (String name, String pol, int weigh) {
            this.name = name;
            this.pol = pol;
            this.weigh = weigh;
        }
        public Human (String name, int weigh, int heigh, int age) {
            this.name = name;
            this.weigh = weigh;
            this.heigh = heigh;
            this.age = age;
        }
        public Human (String name, String pol, String adress, int weigh, int heigh, int age) {
            this.name = name;
            this.pol = pol;
            this.adress = adress;
            this.weigh = weigh;
            this.heigh = heigh;
            this.age = age;
        }
    }
}