package javacore.level10.lectore_2.javarush;

import javacore.level10.lectore_2.asset.Asset;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Читаем и пишем в файл: JavaRush
 * Реализуйте логику записи в файл и чтения из файла для класса JavaRush.
 * Метод main реализован только для вас и не участвует в тестировании.
 */

public class Solution {
    public static void main(String[] args) {
        try {
            //           File yourFile = File.createTempFile("your_file_name", null);
            File yourFile = new File("d:/sere.txt");
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);

            JavaRush javaRush = new JavaRush();
            User user1 = new User();
            user1.setFirstName("Ivan");
            user1.setLastName("Petrov");
            user1.setBirthDate(new Date(2555555));
            user1.setMale(true);
            user1.setCountry(User.Country.RUSSIA);
            javaRush.users.add(user1);
            System.out.println(user1);

            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);

            System.out.println(javaRush.equals(loadedObject));

            outputStream.close();
            inputStream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            PrintWriter printWriter = new PrintWriter(outputStream);
            if (this.users.size() > 0) {
                for (User current : this.users) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(current.getFirstName());
                    sb.append("/");
                    sb.append(current.getLastName());
                    sb.append("/");
                    sb.append(current.getBirthDate().getTime());
                    sb.append("/");
                    sb.append(current.isMale());
                    sb.append("/");
                    sb.append(current.getCountry());
                    printWriter.println(sb);
                }
            }
            printWriter.close();
        }

        public void load(InputStream inputStream) throws Exception {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                User user = new User();
                String[] lineArray = line.split("/");
                if (lineArray.length < 5) {
                    break;
                }
                user.setFirstName(lineArray[0]);
                user.setLastName(lineArray[1]);
                user.setBirthDate(new Date(Long.parseLong(lineArray[2])));
                user.setMale(Boolean.parseBoolean(lineArray[3]));
                switch (lineArray[4]) {
                    case "UKRAINE":
                        user.setCountry(User.Country.UKRAINE);
                        break;
                    case "RUSSIA":
                        user.setCountry(User.Country.RUSSIA);
                        break;
                    case "OTHER":
                        user.setCountry(User.Country.OTHER);
                        break;
                }
                this.users.add(user);
            }
            bufferedReader.close();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            JavaRush javaRush = (JavaRush) o;
            return users != null ? users.equals(javaRush.users) : javaRush.users == null;
        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
