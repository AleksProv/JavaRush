package javacore.level6.lectore_3;

/*
поговорим о музыке
 */

import java.util.Date;

public class Solution_4 {
    public static int delay = 1000;

    public static void main(String[] args) {
        Thread violin = new Thread(new Violin("Player"));
        violin.start();
    }


    public static void sleepNSeconds(int n) {
        try {
            Thread.sleep(n * delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public interface MusicalInstrument extends Runnable {
        Date startPlaying();

        Date stopPlaying();
    }

    public static class Violin implements MusicalInstrument {
        private String owner;

        public Violin(String owner) {
            this.owner = owner;
        }

        public Date startPlaying() {
            System.out.println(this.owner + " is starting to play");
            return new Date();
        }

        public Date stopPlaying() {
            System.out.println(this.owner + " is stopping to play");
            return new Date();
        }

        @Override
        public void run() {
            Date a = startPlaying();
            sleepNSeconds(1);
            Date b = stopPlaying();
            System.out.println("Playing " + (b.getTime() - a.getTime()) + " ms");
        }
    }

}