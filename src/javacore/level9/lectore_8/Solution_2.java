package javacore.level9.lectore_8;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Ридер обертка 2
 * В методе main подмените объект System.out написанной тобой ридер-оберткой по аналогии с лекцией.
 * Твоя ридер-обертка должна заменять все подстроки "te" на "??".
 * Вызови готовый метод printSomething(), воспользуйтесь testString.
 * Верни переменной System.out первоначальный поток.
 * Выведи модифицированную строку в консоль
 */

public class Solution_2 {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        testString.printSomething();
        System.setOut(consoleStream);
        String result = outputStream.toString().replaceAll("te", "??");
        System.out.println(result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("It's a text for testing");
        }
    }
}
