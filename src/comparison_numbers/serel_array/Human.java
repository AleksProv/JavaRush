package comparison_numbers.serel_array;

import java.io.*;

public class Human {
    public Cat cat;

    public void save2(PrintWriter writer, Cat cat) {
        String isCatYes = cat != null ? "yes" : "no";
        writer.println(isCatYes);
        writer.flush();
        if (cat != null) {
            cat.save(writer);
        }
    }

    public static void main(String[] args) {
        File file = new File("d://sere2.txt");
        Cat cat1 = new Cat("Кот1", 5);
        try (PrintWriter writer = new PrintWriter(file);
             BufferedReader reader = new BufferedReader(new FileReader(file));) {
            Human human = new Human();
            human.save2(writer, cat1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
