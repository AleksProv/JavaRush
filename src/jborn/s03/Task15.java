package jborn.s03;
/*
*** Из консоли вводится строка. Найти наибольшее количество идущих подряд одинаковых символов. Например.
Введите строку: "Пррривет всееем моиииим друзьям!"
Результат:
Символ: "и"
Повторяется (раз): 4
Начиная с символа под номером: 19
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task15 {
    public static void main (String[] args) throws Exception {
        String line = readString ();
        char currentChar = ' ';
        char maxChar = ' ';
        int currentCounter = 0;
        int maxCounter = 0;
        int positionMaxChar = 0;
        int positionCurrent = 0;

        for (char tmpChar : line.toCharArray ()) {
            positionCurrent++;
            if (tmpChar == currentChar)
                currentCounter++;
            else {
                if (currentCounter >= maxCounter && currentCounter != 0) {
                    maxCounter = currentCounter;
                    currentCounter = 0;
                    maxChar = currentChar;
                    positionMaxChar = positionCurrent - maxCounter;
                } else if (currentCounter < maxCounter) {
                    currentCounter = 0;
                }
                currentChar = tmpChar;
            }
        }
//если максимальный символ окажется последним
        if (currentCounter > maxCounter) {
            maxCounter = currentCounter;
            maxChar = currentChar;
            positionMaxChar = positionCurrent - currentCounter + 1;
        }
        System.out.print ("Символ " + "\'" + maxChar + "\'" + " повторяется " + ++maxCounter + " раз, начиная с символа под номер " + --positionMaxChar);
    }

    public static String readString () throws Exception {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        return reader.readLine ();
    }

}