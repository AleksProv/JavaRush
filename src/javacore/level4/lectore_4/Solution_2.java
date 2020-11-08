package javacore.level4.lectore_4;

/*
Коты
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_2 {
    public static void main(String[] args) {
        String s = null;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
            s = reader.readLine();
            if (s.equals(""))
                break;
            else
                System.out.println(CatFactory.getCatByKey(s));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static class CatFactory {
        static Cat getCatByKey(String key) {
            Cat cat = null;
            if ("vaska".equals(key)) {
                cat = new MaleCat("Василий");
            } else if ("murka".equals(key)) {
                cat = new FemaleCat("Мурочка");
            } else if ("kiska".equals(key)) {
                cat = new FemaleCat("Кисюлька");
            } else {
                cat = new Cat(key);
            }
            return cat;
        }
    }


    static class Cat {
        private String name;

        protected Cat(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        @Override
        public String toString() {
            return "Я уличный кот " + getName();
        }
    }


    static class MaleCat extends Cat {
        MaleCat(String name) {
            super(name);
        }

        @Override
        public String toString() {
            return "Я - солидный кошак по имени " + getName();
        }
    }


    static class FemaleCat extends Cat {
        FemaleCat(String name) {
            super(name);
        }

        @Override
        public String toString() {
            return "Я милая кошечка по имени " + getName();
        }
    }

}