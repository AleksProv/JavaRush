package javacore.level9.lectore_3.adapter;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Адаптер
 * Используй класс AdapterFileOutputStream, чтобы адаптировать FileOutputStream к новому интерфейсу AmigoStringWriter.
 */

public class AdapterFileOutputStream implements AmigoStringWriter {
    private final FileOutputStream fileOutputStream;

    public AdapterFileOutputStream(FileOutputStream fileOutputStream) {
        this.fileOutputStream = fileOutputStream;
    }

    @Override
    public void flush() throws IOException {
        fileOutputStream.flush();
    }

    @Override
    public void writeString(String s) throws IOException {
        fileOutputStream.write(s.getBytes());
    }

    @Override
    public void close() throws IOException {
        fileOutputStream.close();
    }

    public static void main(String[] args) {
    }
}
