package javacore.level6.lectore_5;

/*
Справедливость
 */

import javacore.level5.lectore_12.hryvnia.Solution;

public class Solution_4 {
    public static void main(String[] args){
        Mouse alpha = new Mouse("№1");
 //       alpha.join();
        Mouse mouse1 = new Mouse("№2");
        Mouse mouse2 = new Mouse("№3");
    }

    private static void eat() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static class Mouse extends Thread {
        public Mouse(String name) {
            super(name);
            start();
        }

        public void run() {
            System.out.println(getName() + " is starting to eat");
            eat();
            System.out.println(getName() + " has finished eating");
        }
    }
}