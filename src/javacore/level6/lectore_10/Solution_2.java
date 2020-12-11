package javacore.level6.lectore_10;

/*
Отсчет на гонках
 */

public class Solution_2 {
    public static volatile int numSeconds = 5;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        Thread.sleep(3500);
        clock.interrupt();
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        @Override
        public void run() {
            try {
                for (int i = numSeconds; numSeconds > 0; numSeconds--) {
                    System.out.print(numSeconds + " ");
                    Thread.sleep(1000);
                }
                System.out.print("Марш!");

            } catch (InterruptedException e) {
                System.out.println("Прервано!");
            }
        }
    }
}
