package level8.lectore_11;
/*
Собираем семейство
 */

import java.util.ArrayList;

public class Solution_6 {
    public static void main (String[] args) {
        Human human7 = new Human ("Child1", false, 9);
        Human human8 = new Human ("Child2", false, 10);
        Human human9 = new Human ("Child3", false, 11);
        ArrayList<Human> children = new ArrayList<> ();
        children.add (human7);
        children.add (human8);
        children.add (human9);
        Human human5 = new Human ("Pet", true, 41, children);
        Human human6 = new Human ("Pety", false, 39, children);
        ArrayList<Human> children2 = new ArrayList<> ();
        children2.add (human5);
        ArrayList<Human> children3 = new ArrayList<> ();
        children3.add (human6);
        Human human1 = new Human ("Ivan1", true, 60, children2);
        Human human2 = new Human ("Ivan2", true, 61, children3);
        Human human3 = new Human ("Mari1", false, 57, children2);
        Human human4 = new Human ("Mari2", false, 58, children3);
        System.out.println (human1.toString ());
        System.out.println (human2.toString ());
        System.out.println (human3.toString ());
        System.out.println (human4.toString ());
        System.out.println (human5.toString ());
        System.out.println (human6.toString ());
        System.out.println (human7.toString ());
        System.out.println (human8.toString ());
        System.out.println (human9.toString ());
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human (String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public Human (String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = new ArrayList<> ();
        }

        public String toString () {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size ();
            if (childCount > 0) {
                text += ", дети: " + this.children.get (0).name;
                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get (i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
