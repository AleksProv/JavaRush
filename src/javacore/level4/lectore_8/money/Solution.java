package javacore.level4.lectore_8.money;

/*
Валюты
 */

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Person ivan = new Person("Иван");
        for (Money money : ivan.getAllMoney()){
            System.out.println(ivan.name + " имеет заначку в размере " + money.getAmount() + " " +money.getCurrencyName());
        }
    }


    static class Person {
        public String name;

        public Person(String name) {
            this.name = name;
            this.allMoney = new ArrayList<>();
            allMoney.add(new Ruble(2022));
            allMoney.add(new USD(1022));
            allMoney.add(new Hryvnia(3022));
        }

        private List<Money> allMoney;

        public List<Money> getAllMoney(){
            return allMoney;
        }
    }

}