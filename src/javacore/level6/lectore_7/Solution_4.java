package javacore.level6.lectore_7;

/*
Обратный отсчет
 */

import java.util.ArrayList;
import java.util.List;

public class Solution_4 {
    public static volatile List<String> list = new ArrayList<>(5);

    static {
        for (int i = 0; i < 5; i++) {
            list.add("Строка " + i);
        }
    }

    public static void main(String[] args) {
        Thread t = new Thread(new Coundown(3), "Countdown");
        t.start();
    }

    public static class Coundown implements Runnable {
        private int countFrom;

        public Coundown(int countFrom) {
            this.countFrom = countFrom;
        }

        @Override
        public void run() {
            try {
                while (countFrom > 0) {
                    printCountdown();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        private void printCountdown() throws InterruptedException {
            countFrom--;
            Thread.sleep(500);
            System.out.println(list.get(countFrom));
        }


    }

}
