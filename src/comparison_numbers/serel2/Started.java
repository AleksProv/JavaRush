package comparison_numbers.serel2;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Started {
    private static List<Human> humans = new ArrayList<>();
    private static String fileName = "baza.ser";

    public static void main(String[] args) {
        humans = (ArrayList<Human>) deser(fileName);
        Human human = new Human();
        human.setName(JOptionPane.showInputDialog(null, "Введите имя"));
        human.setFio(JOptionPane.showInputDialog(null, "Введите фамилию"));
        humans.add(human);
        for (Human person : humans) {
            System.out.println(person.getName() + " " + person.getFio());
        }
        serel(humans);
    }

    private static void serel(List<Human> human) {
        try (FileOutputStream fis = new FileOutputStream(fileName);
             ObjectOutputStream oos = new ObjectOutputStream(fis)) {
            oos.writeObject(human);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Object deser(String fileName) {
        Object retObject = null;
        try (FileInputStream fis = new FileInputStream(fileName);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            retObject = ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return retObject;
    }

}
