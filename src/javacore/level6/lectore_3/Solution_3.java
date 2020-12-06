package javacore.level6.lectore_3;

/*
Список и нити
 */

import java.util.ArrayList;
import java.util.List;

public class Solution_3 {
    public static volatile List<Thread> list = new ArrayList<>(5);

    public static void main(String[] args) {
        list.add(new Thread(new SpecialTread()));
        list.add(new Thread(new SpecialTread()));
        list.add(new Thread(new SpecialTread()));
        list.add(new Thread(new SpecialTread()));
        list.add(new Thread(new SpecialTread()));
    }

    public static class SpecialTread implements Runnable {
        @Override
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}