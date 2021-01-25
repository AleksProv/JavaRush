package javasyntax.level5.lectore_5;

//Реализовать метод драки котов figth(Cat anotherCat). У кого параметры больше, тот и выграл.

public class Cat {
    int age;
    int weigth;
    int strength;

    public Cat () {
    }

    public boolean fight (Cat anotherCat) {
        int count1 = 0;
        int count2 = 0;
        if (this.strength > anotherCat.strength)
            count1++;
        else if (this.strength < anotherCat.strength)
            count2++;
        if (this.age > anotherCat.age)
            count1++;
        else if (this.age < anotherCat.age)
            count2++;
        if (this.weigth > anotherCat.weigth)
            count1++;
        else if (this.weigth < anotherCat.weigth)
            count2++;

        if (count1 > count2)
            return true;
        else
            return (count1 >= count2);
    }

    public static void main (String[] args) {
        Cat cat1 = new Cat ();
        cat1.age = 5;
        cat1.weigth = 10;
        cat1.strength = 15;
        Cat cat2 = new Cat ();
        cat2.age = 2;
        cat2.weigth = 5;
        cat2.strength = 20;
        System.out.println (cat1.fight (cat2));
        System.out.println (cat2.fight (cat1));
    }
}

