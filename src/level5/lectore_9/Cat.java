package level5.lectore_9;

/*
Конструируем котиков.
 */

public class Cat {
    public String name;
    public int age;
    public int weight;
    public String address;
    public String color;

    public Cat (String name) {
        this.name = name;
        this.age = 2;
        this.weight = 5;
        this.color = "серый";
    }

    public Cat (String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "белый";
    }

    public Cat (String name, int age) {
        this.name = name;
        this.weight = 3;
        this.age = age;
        this.color = "белый";
    }

    public Cat (int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.age = 1;
    }

    public Cat (int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = 1;
    }

    public static void main (String[] args) {
    }
}
