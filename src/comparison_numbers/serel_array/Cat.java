package comparison_numbers.serel_array;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Cat {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void save(PrintWriter writer) {
        writer.println(name);
        writer.println(age);
        writer.flush();
    }

    public void load(BufferedReader reader) throws IOException {
        name = reader.readLine();
        age = Integer.parseInt(reader.readLine());
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
