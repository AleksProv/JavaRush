package level5.lectore_9;

/*
Регистрируем собачек.
 */

public class Dog {
    public String name;
    public int height;
    public String color;

    public Dog (String name) {
        this.name = name;
    }

    public Dog (String name, int height) {
        this.name = name;
        this.height = height;
    }

    public Dog (String name, int height, String color) {
        this.name = name;
        this.height = height;
        this.color = color;
    }

    public static void main (String[] args) {
    }
}