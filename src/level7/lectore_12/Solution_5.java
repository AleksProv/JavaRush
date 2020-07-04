package level7.lectore_12;

/*
Семейная перепись.
 */

public class Solution_5 {
    public static void main (String[] args) {
        Human famili6 = new Human ("Вася",true,65);
        Human famili7 = new Human ("Коля",true,66);
        Human famili8 = new Human ("Валя",false,60);
        Human famili9 = new Human ("Поля",false,61);
        Human famili1 = new Human ("Саша",true,43, famili6,  famili8);
        Human famili2 = new Human ("Света",false,35, famili7, famili9);
        Human famili3 = new Human ("Маша",false,10, famili1, famili2);
        Human famili4 = new Human ("Катя",false,11, famili1, famili2);
        Human famili5 = new Human ("Ира",false,12, famili1, famili2);
        System.out.println (famili1.toString ());
        System.out.println (famili2.toString ());
        System.out.println (famili3.toString ());
        System.out.println (famili4.toString ());
        System.out.println (famili5.toString ());
        System.out.println (famili6.toString ());
        System.out.println (famili7.toString ());
        System.out.println (famili8.toString ());
        System.out.println (famili9.toString ());
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human (String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human (String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString () {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;
            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }
            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }
            return text;
        }
    }
}