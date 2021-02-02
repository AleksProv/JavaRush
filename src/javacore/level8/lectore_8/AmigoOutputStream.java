package javacore.level8.lectore_8;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * AmigoOutputStream
 * 1 Измени класс AmigoOutputStream так, чтобы он стал Wrapper-ом для класса FileOutputStream.
 * Используй наследование. 2 При вызове метода close() должны выполняться следующая последовательность действий:
 * 2.1 Вызвать метод flush().
 * 2.2 Дописать следующий текст "JavaRush © All rights reserved.", используй метод getBytes().
 */

public class AmigoOutputStream extends FileOutputStream {

    public static String fileName = "C:/tmp/result.txt";
    public FileOutputStream fileOutputStream;

    public AmigoOutputStream(FileOutputStream fileOutputStream) throws FileNotFoundException {
        super(fileName);
        this.fileOutputStream = fileOutputStream;
    }


    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }

    @Override
    public void write(int b) throws IOException {
        fileOutputStream.write(b);
    }

    @Override
    public void flush() throws IOException {
        fileOutputStream.flush();
    }

    @Override
    public void write(byte[] b) throws IOException {
        fileOutputStream.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        fileOutputStream.write(b, off, len);
    }

    @Override
    public void close() throws IOException {
        flush();
        write("JavaRush © All rights reserved.".getBytes());
        fileOutputStream.close();
    }
}
