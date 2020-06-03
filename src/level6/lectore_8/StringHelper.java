package level6.lectore_8;
/*
Класс StringHelper. Первый метод выводит 5 раз, второй метод N раз.
 */

public class StringHelper {

    public static String multiply (String s) {
        String result = "";
        for (int i = 0; i < 5; i++) {
            result = result.concat (s);
        }
        return result;
    }

    public static String multiply (String s, int count) {
        String result = "";
        for (int i = 0; i < count; i++) {
            result = result.concat (s);
        }
        return result;
    }

    public static void main (String[] args) {
    }
}