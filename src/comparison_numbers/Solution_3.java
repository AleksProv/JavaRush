package comparison_numbers;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Solution_3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("d:/data2.txt"))) {
            String c;
            while ((c = reader.readLine()) != null) {
                list.add(c);
            }
        } catch (IOException e) {
        }
        for (String pear : list) {
            System.out.println(pear);
        }

    }
}
