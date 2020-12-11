package javacore.level6.lectore_10;

/*
Считаем секунды
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(in);
        //create and run thread
        Stopwatch stopwatch = new Stopwatch();
        stopwatch.start();
        //read a string
        reader.readLine();
        stopwatch.interrupt();
        //close streams
        reader.close();
        in.close();
    }

    public static class Stopwatch extends Thread{
        private int seconds;

        @Override
        public void run() {
            try {
                while (!currentThread().isInterrupted()){
                    Thread.sleep(1000);
                    seconds++;
                }
            } catch (InterruptedException e){
                System.out.println(seconds);
            }
        }
    }
}
