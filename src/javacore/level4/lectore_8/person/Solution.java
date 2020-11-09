package javacore.level4.lectore_8.person;

/*
User, Loser, Coder and Proger
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person;
        String key;

        while (true) {
            key = reader.readLine();
            if ("user".equals(key)) {
                person = new Person.User();
            } else if (key.equals("loser")) {
                person = new Person.Loser();
            } else if (key.equals("coder")) {
                person = new Person.Coder();
            } else if (key.equals("proger")) {
                person = new Person.Proger();
            } else {
                break;
            }
            doWork(person);
        }
    }

    public static void doWork(Person person) {
        if (person instanceof Person.User){
            ((Person.User) person).live();
        } else if (person instanceof Person.Loser){
            ((Person.Loser) person).doNothing();
        } else if (person instanceof Person.Proger){
            ((Person.Proger) person).enjoy();
        } else if (person instanceof  Person.Coder){
            ((Person.Coder) person).writeCode();
        }
    }
}