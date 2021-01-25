package javasyntax.level5.lectore_9;

/*
Создать класс Прямоугольник и 4 конструктора.
 */

public class Rectangle {
    public int top, left, width, height;

    public Rectangle (int top) {
        this.top = top;
        this.left = 10;
        this.width = 20;
        this.height = 30;
    }

    public Rectangle (int top, int left) {
        this.top = top;
        this.left = left;
        this.width = 0;
        this.height = 0;
    }

    public Rectangle (int top, int left, int width) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = 10;
    }

    public Rectangle (int top, int left, int width, int height) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public static void main (String[] args) {
    }
}
