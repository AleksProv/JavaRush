package javacore.level5.lectore_12.constructor;
/*
Перегрузка конструкторов
 */

public class Solution {
    public int age;
    public String name;
    public String fio;
    public String work;


    private Solution(int age, String name) {
        this.age = age;
        this.name = name;
    }

    protected Solution(String name, String fio) {
        this.name = name;
        this.fio = fio;
    }

    public Solution(int age, String name, String fio, String work) {
        this.age = age;
        this.name = name;
        this.fio = fio;
        this.work = work;
    }

    Solution(int age, String fio, String work) {
        this.age = age;
        this.fio = fio;
        this.work = work;
    }

    public static void main(String[] args) {

    }
}