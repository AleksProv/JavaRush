package javacore.level9.lectore_8;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Ридер обертка
 * В методе main подмени объект System.out написанной тобой ридер-оберткой по аналогии с лекцией.
 * Твоя ридер-обертка должна преобразовывать весь текст в заглавные буквы.
 * Вызови готовый метод printSomething(), воспользуйся testString.
 * Верни переменной System.out первоначальный поток.
 * Выведи модифицированную строку в консоль
 */

public class Solution_1 {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        //запоминаем настоящий PrintStream в специальную переменную
        PrintStream consoleStream = System.out;
        //Создаем динамический массив
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        //создаем адаптер к классу PrintStream
        PrintStream stream = new PrintStream(outputStream);
        //Устанавливаем его как текущий System.out
        System.setOut(stream);
        //Вызываем функцию, которая ничего не знает о наших манипуляциях
        testString.printSomething();
        //Возвращаем все как было
        System.setOut(consoleStream);
        //Преобразовываем записанные в наш ByteArray данные в строку
        String result = outputStream.toString().toUpperCase();
        //выводим в консоль
        System.out.println(result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("It's a text for testing");
        }
    }
}
