package level5.lectore_12;

/*
Том и Джери.
 */

public class Solution_2 {
    public static void main (String[] args) {
        Mouse jerryMouse = new Mouse ("Jerry", 12, 5);
        Dog dog = new Dog ("Fill", 50, 20);
        Cat cat = new Cat ("Tom", 30, 15);
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse (String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Dog {
        String name;
        int height;
        int tail;

        public Dog (String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Cat {
        String name;
        int height;
        int tail;

        public Cat (String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }
}
