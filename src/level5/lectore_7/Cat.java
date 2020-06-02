package level5.lectore_7;

/*
Создать класс Cat с пятью инициализаторами.
 */

public class Cat {
    String name;
    int weight;
    int age;
    String address;
    String color;

    public void initialize (String name) {
        this.name = name;
        this.weight = 4;
        this.age = 2;
        this.color = "серый";
    }

    public void initialize (String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 5;
        this.color = "серый";
    }

    public void initialize (String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "белый";
    }

    public void initialize (int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.age = 3;
    }

    public void initialize (int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = 3;
    }

    public static void main (String[] args) {
    }
}
