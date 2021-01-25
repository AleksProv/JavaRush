package javasyntax.level5.lectore_7;

/*
Создать класс Прямоугольник и 4 инициализатора.
 */

public class Rectangle {
    int top, left, width, height;

    public void initialize (int top) {
        this.top = top;
        this.left = 10;
        this.width = 20;
        this.height = 30;
    }

    public void initialize (int top, int left) {
        this.top = top;
        this.left = left;
        this.width = 0;
        this.height = 0;
    }

    public void initialize (int top, int left, int width) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = 10;
    }

    public void initialize (int top, int left, int width, int height) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public static void main (String[] args) {
    }
}
