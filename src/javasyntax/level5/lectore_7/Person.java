package javasyntax.level5.lectore_7;

/*
Инициализация объектов. Исправь класс, чтобы один метод инициализировал все переменные класса.
 */

public class Person {
    String name;
    char sex;
    int money;
    int weight;
    double size;

    public void initialize (String name, char sex, int money, int weight,  double size) {
        this.name = name;
        this.sex = sex;
        this.money = money;
        this.weight = weight;
        this.size = size;
    }

    public static void main (String[] args) {
    }
}