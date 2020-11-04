package javacore.level3.lectore_11.repka;

/*
Репка
 */

import java.util.ArrayList;
import java.util.List;

public class Solution_2 {
    public static void main(String[] args) {
        List<Person> plot = new ArrayList<>();
        plot.add(new Person("Репка","Репку"));
        plot.add(new Person("Дедка","Дедку"));
        plot.add(new Person("Babka","Бабку"));
        plot.add(new Person("Внучка","Внучку"));
        RepkaStory.tell(plot);
    }
}