package javasyntax.level4.lectore_7;
/*
  Вывести описание числа от 1 до 999
 */
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class DescribeNumbers2 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число ");
        int t1 = Integer.parseInt(reader.readLine());

        if (t1 > 0 && t1 < 1000) {

            if (t1 % 2 == 0)
                System.out.print("четное");
            else
                System.out.print("нечетное");

            if (t1 < 10)
                System.out.println(" однозначное число");
            else if (t1 < 100)
                System.out.println(" двузначное число");
            else
                System.out.println(" трехзначное число");
        }
    }
}



