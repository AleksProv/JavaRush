package level9.lectore_11;
/*
Обогатим код функциональностью!
 */

import java.io.*;

public class Solution_10 {
    public static void main (String[] args) throws IOException {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        String sourceFileName = reader.readLine ();
        InputStream fileInputStream = null;

        try {
            fileInputStream = getInputStream (sourceFileName);
        } catch (FileNotFoundException e) {
            System.out.println ("Файл не существует");
            sourceFileName = reader.readLine ();
            fileInputStream = getInputStream (sourceFileName);
        }

        String destinationFileName = reader.readLine ();
        OutputStream fileOutputStream = getOutputStream (destinationFileName);

        while (fileInputStream.available () > 0) {
            int data = fileInputStream.read ();
            fileOutputStream.write (data);
        }

        fileInputStream.close ();
        fileOutputStream.close ();
    }

    public static InputStream getInputStream (String fileName) throws IOException {
        return new FileInputStream (fileName);
    }

    public static OutputStream getOutputStream (String fileName) throws IOException {
        return new FileOutputStream (fileName);
    }
}