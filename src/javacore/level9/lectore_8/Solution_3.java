package javacore.level9.lectore_8;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Выводим только цифры
 * В методе main подмени объект System.out написанной тобой ридер-оберткой по аналогии с лекцией.
 * Твоя ридер-обертка должна выводить только цифры.
 * Вызови готовый метод printSomething(), воспользуйтесь testString.
 * Верни переменной System.out первоначальный поток.
 * Выведи модифицированную строку в консоль
 */

public class Solution_3 {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        testString.printSomething();
        System.setOut(consoleStream);
        String result = outputStream.toString();
 //       String regex = "[^\\d\\.] | \\. | \\.$ | \\s";
        result = result.replaceAll("\\D", "");
        System.out.println(result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("It's 1 a 23 text 4 f5-6or7 tes8ting");
        }
    }
}
