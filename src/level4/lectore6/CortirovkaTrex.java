package level4.lectore6;

/*
Ввести с клавиатуры три чилса и вывести их в порядке убывания.
 */

import java.io.InputStreamReader;
import java.io.BufferedReader;

public class CortirovkaTrex {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число 1");
        int t1 = Integer.parseInt(reader.readLine());
        System.out.println("Введите число 2");
        int t2 = Integer.parseInt(reader.readLine());
        System.out.println("Введите число 3");
        int t3 = Integer.parseInt(reader.readLine());

        if (t1 >= t2 &&  t1 >= t3 )
            if (t2 >= t3)
                System.out.print(t1+" "+t2+" "+t3);
            else
                System.out.print(t1+" "+t3+" "+t2);
        else if (t2 >= t1 &&  t2 >= t3 )
            if (t1 >= t3)
                System.out.print(t2+" "+t1+" "+t3);
            else
                System.out.print(t2+" "+t3+" "+t1);
        //else if (t3 >= t1 &&  t3 >= t2 )

            if (t1 >= t2)
                System.out.print(t3+" "+t1+" "+t2);
            else
                System.out.print(t3+" "+t2+" "+t1);
    }
}
