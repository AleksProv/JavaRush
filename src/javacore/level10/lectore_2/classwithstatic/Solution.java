package javacore.level10.lectore_2.classwithstatic;

import javacore.level10.lectore_2.asset.Asset;

import java.io.*;
import java.util.Objects;

/**
 * Читаем и пишем в файл статики
 * Пришло время «статиков»! Реализуйте логику записи в файл и чтения из файла для класса ClassWithStatic.
 * Метод load должен инициализировать объект включая статические поля данными из файла.
 * А метод main в тестировании не участвует.
 */

public class Solution {
    public static void main(String[] args) {
        try {
 //           File fileName = File.createTempFile("D:\\temp.txt", null);
            File fileName = new File("D:\\temp.txt");
            OutputStream outputStream = new FileOutputStream(fileName);
            InputStream inputStream = new FileInputStream(fileName);

            ClassWithStatic classWithStatic = new ClassWithStatic();
            classWithStatic.i = 3;
            classWithStatic.j = 4;
            classWithStatic.save(outputStream);
            outputStream.flush();


            ClassWithStatic loadedObject = new ClassWithStatic();
            ClassWithStatic.staticString = "something";
            loadedObject.i = 6;
            loadedObject.j = 7;
            loadedObject.load(inputStream);
           System.out.println(classWithStatic.equals(loadedObject));

            outputStream.close();
            inputStream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static class ClassWithStatic{
        public static String staticString = "This is a static string";
        public int i;
        public int j;

        public void save(OutputStream outputStream) throws Exception {
            PrintWriter printWriter = new PrintWriter(outputStream);
            printWriter.println(staticString);
            printWriter.println(this.i);
            printWriter.println(this.j);
            printWriter.close();
        }

        public void load(InputStream inputStream) throws Exception {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            staticString = bufferedReader.readLine();
            this.i = Integer.parseInt(bufferedReader.readLine());
            this.j = Integer.parseInt(bufferedReader.readLine());
            bufferedReader.close();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ClassWithStatic that = (ClassWithStatic) o;

            if (i !=that.i) return false;
            return j == that.j;
        }

        @Override
        public int hashCode() {
            int result = i;
            result = 31 * result + j;
            return result;
        }
    }
}
