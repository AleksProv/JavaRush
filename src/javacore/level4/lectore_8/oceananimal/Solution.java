package javacore.level4.lectore_8.oceananimal;

/*
исправление ошибок I Java Core: 4 уровень, 8 лекция
 */

public class Solution {
    public static void main(String[] args) {
        Swimmable animal = new Orca();
        animal.swim();
        animal = new Whale();
        animal.swim();
        animal = new Otter();
        animal.swim();
    }

    public static void test(Swimmable animal) {
        animal.swim();
    }

    interface Walkable {
        void walk();
    }

    interface Swimmable {
        void swim();
    }


    static abstract class OceanAnimal {
        public void swim() {
            OceanAnimal currentAnimal = (OceanAnimal) getCurrentAnimal();
        }

        private void displaySwim() {
            System.out.println(getCurrentAnimal().getClass().getSimpleName() + " is swimming");
        }

        abstract Swimmable getCurrentAnimal();
    }

    static class Orca extends OceanAnimal implements Swimmable{
        //косатка
        @Override
        Swimmable getCurrentAnimal() {
            return this;
        }
    }

    static class Whale extends OceanAnimal implements Swimmable{
        //кит
        @Override
        Swimmable getCurrentAnimal() {
            return this;
        }
    }

    static class Otter implements Walkable, Swimmable {
        //выдра
        @Override
        public void walk() {
        }

        @Override
        public void swim() {
        }
    }

}