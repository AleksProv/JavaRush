package javacore.level6.lectore_13.ball;

/*
Клубок
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println("InterruptedException");
                }
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("Ура");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                    }
                }
            }
        });

        Thread thread4 = new FourThread();

        Thread thread5 = new Thread(new Runnable() {
            @Override
            public void run() {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                try {
                    int summ = 0;
                    while (true) {
                        String simvol = reader.readLine();
                        if (simvol.equals("N")) {
                            break;
                        } else {
                            int number = Integer.parseInt(simvol);
                            summ += number;
                        }
                    }
                    System.out.println("Сумма чисел = " + summ);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        threads.add(thread1);
        threads.add(thread2);
        threads.add(thread3);
        threads.add(thread4);
        threads.add(thread5);

    }

    public static void main(String[] args) {
        for (Thread thread : threads) {
            thread.start();
        }
    }

    public static class FourThread extends Thread implements Message {
        @Override
        public void run() {
            while (!isInterrupted()){
            }
        }

        @Override
        public void showWarning() {
            this.interrupt();
        }
    }

}