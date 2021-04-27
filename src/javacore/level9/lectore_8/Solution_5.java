package javacore.level9.lectore_8;

import java.io.*;

/**
 * Дублируем текст
 * Считайте с консоли имя файла.
 * В main подмените объект System.out написанной вами ридер-оберткой.
 * Ридер-обертка должна дублировать вывод всего текста в файл и в консоль, имя которого было считано.
 * Вызовите готовый метод printSomething(), воспользуйтесь testString и верните переменной System.out первоначальный поток.
 * Закройте поток файла.
 */

public class Solution_5 { //d:/003/file7.txt
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);

        testString.printSomething();

        FileOutputStream fos = new FileOutputStream(fileName);
        fos.write(outputStream.toByteArray());
        fos.close();

        System.setOut(consoleStream);
        System.out.println(outputStream.toString());
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("It's a text for testing");
        }
    }
}
