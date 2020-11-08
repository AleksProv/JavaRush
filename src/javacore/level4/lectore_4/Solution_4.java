package javacore.level4.lectore_4;

/*
Player and Dancer
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key;
        while (!(key = reader.readLine()).equals("exit")){
            if ("player".equals(key)){
                person = new Player();
            } else if ("dancer".equals(key)){
                person = new Dancer();
            }
            haveFun(person);
        }

    }

    public static void haveFun(Person person){
        if (person instanceof Player){
            ((Player) person).play();
        } else if (person instanceof Dancer) {
            ((Dancer) person).dance();
        }
    }


    interface Person{
    }


    static class Player implements Person{
        void play(){
            System.out.println("playing");
        }
    }

    static class Dancer implements Person {
        void dance(){
            System.out.println("dancing");
        }
    }
}
