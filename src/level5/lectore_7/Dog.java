package level5.lectore_7;

/*
Создать класс Dog с тремя иницилиализаторами.
 */

public class Dog {
    String name;
    int height;
    String color;

    public void initialize (String name) {
        this.name = name;
    }

    public void initialize (String name, int height) {
        this.name = name;
        this.height = height;
    }

    public void initialize (String name, int height, String color) {
        this.name = name;
        this.height = height;
        this.color = color;
    }

    public static void main (String[] args) {
    }
}
