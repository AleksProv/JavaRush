package comparison_numbers.serel;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        Person ivanov = new Person(1, "Ivanov", "М", "6001 845787",
                new Family("married", "childrens",2));
        Person petrov = new Person(2, "Petrov", "М", "6003 945787",
                new Family("married", "children",1));
        Person sidorova = new Person(3, "Sidorova", "Ж", "6005 945888",
                new Family("married", "childrens",3));
        people.add(ivanov);
        people.add(petrov);
        people.add(sidorova);
        for (Person name : people) {
            System.out.println(name);
        }

        serePerson(people);
        List<Person> personList = (List<Person>) deserPerson();
        if (personList != null) {
            for (Person name : personList) {
                System.out.println(name);
            }
        }

    }

    public static void serePerson(List<Person> list) {
        File file = new File("d:/sere.txt");
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            oos.close();
            System.out.println("Серализация успешно завершена.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Object deserPerson() {
        File file = new File("d:/sere.txt");
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object obj = ois.readObject();
            ois.close();
            System.out.println("Десерализация успешно завершена.");
            return obj;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
