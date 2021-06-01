package javacore.level10.lectore_4.sinleton;

import java.io.*;

/**
 * Как сериализовать Singleton?
 * Два десериализованных объекта singleton и singleton1 имеют разные ссылки в памяти, а должны иметь одинаковые.
 * В класс Singleton добавь один метод (погуглите), чтобы после десериализации ссылки на объекты были равны.
 * Метод main не участвует в тестировании.
 */

public class Solution {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Singleton instance = Singleton.getInstance();

        ByteArrayOutputStream byteArrayOutputStream = serializeSingletonInstance(instance);

        Singleton singleton = deserilizeSingletonInstance(byteArrayOutputStream);
        Singleton singleton1 = deserilizeSingletonInstance(byteArrayOutputStream);

        System.out.println("Проверка ourInstance : " + Singleton.getInstance());
        System.out.println("Проверка ourInstance : " + Singleton.getInstance());
        System.out.println("=====================================================");
        System.out.println("Проверка singleton : " + singleton);
        System.out.println("Проверка singleton1 : " + singleton1);
    }

    public static ByteArrayOutputStream serializeSingletonInstance(Singleton instance) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(byteArrayOutputStream);
        oos.writeObject(instance);
        oos.close();
        return byteArrayOutputStream;
    }

    public static Singleton deserilizeSingletonInstance(ByteArrayOutputStream byteArrayOutputStream) throws IOException, ClassNotFoundException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(byteArrayInputStream);
        Singleton singleton = (Singleton) ois.readObject();
        ois.close();
        return singleton;
    }


    public static class Singleton implements Serializable {
        private static Singleton ourInstance;

        private Singleton() {
        }

        public static Singleton getInstance() {
            if (ourInstance == null) {
                ourInstance = new Singleton();
            }
            return ourInstance;
        }

        // добавляем этот метод
        
        private Object readResolve() throws ObjectStreamException {
            return ourInstance;
        }
    }
}
