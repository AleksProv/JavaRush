package javacore.level9.lectore_3.person;

import java.io.IOException;
import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;

/**
 * И еще один адаптер
 * Адаптировать Scanner к PersonScanner.
 * Классом-адаптером является PersonScannerAdapter.
 * В классе адаптере создать приватное финальное поле Scanner fileScanner.
 * Поле инициализировать в конструкторе с одним аргументом типа Scanner.
 * Данные в файле хранятся в следующем виде: Иванов Иван Иванович 31 12 19
 */

public class Solution {
    public static void main(String[] args) {
    }

    public static class PersonScannerAdapter implements PersonScanner {
        private final Scanner fileScanner;


        public PersonScannerAdapter(Scanner scanner) {
            this.fileScanner = scanner;
        }


        @Override
        public Person read() throws IOException {
            String line = fileScanner.nextLine();
            String[] str = line.split(" ",4);
            Date birthDate = null;
            SimpleDateFormat formatter = new SimpleDateFormat("dd MM yyyy",Locale.ENGLISH);
            try {
                birthDate = formatter.parse(str[3]);
            }catch (ParseException e){
            }

// 2 вариант
//            String[] str = line.split(" ");
//            Calendar calendar = new GregorianCalendar(Integer.parseInt(str[5]), Integer.parseInt(str[4])-1, Integer.parseInt(str[3]));
//            Date birthDate = calendar.getTime();
            Person person = new Person(str[1], str[2], str[0], birthDate);
            return person;
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}