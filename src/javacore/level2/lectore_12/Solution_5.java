package javacore.level2.lectore_12;

/*
Посетители
 */

import java.util.HashMap;

public class Solution_5 {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Animal()));
    }


    public static String getObjectType(Object o){
        //1
        HashMap<Class ,String> map = new HashMap();
        map.put(Cat.class , "Кот");
        map.put(Tiger.class , "Тигр");
        map.put(Lion.class , "Лев");
        map.put(Bull.class , "Бык");
        map.put(Cow.class , "Корова");
        return map.getOrDefault(o.getClass(), "Животное");


        // 2
//        HashMap<String ,String> map = new HashMap();
//        map.put("Cat" , "Кот");
//        map.put("Tiger" , "Тигр");
//        map.put("Lion" , "Лев");
//        map.put("Bull" , "Бык");
//        map.put("Cow" , "Корова");
//        String name = o.getClass().getSimpleName();
//        if (map.get(name) != null)
//            return map.get(name);
//        else
//        return "Животное";
    }

    public static class Cat extends Animal {
    }

    public static class Tiger extends Cat {
    }

    public static class Lion extends Cat {
    }

    public static class Bull extends Animal {
    }

    public static class Cow extends Animal {
    }

    public static class Animal {
    }

}