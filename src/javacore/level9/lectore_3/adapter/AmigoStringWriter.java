package javacore.level9.lectore_3.adapter;

import java.io.IOException;

public interface AmigoStringWriter {
    void flush() throws IOException;

    void writeString(String s) throws IOException;

    void close() throws IOException;
}
