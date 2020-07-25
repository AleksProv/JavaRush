package level8.lectore_11;
/*
Множество всех животных
 */

import java.util.HashSet;
import java.util.Set;

public class Solution_2 {
    public static void main (String[] args) {
        Set<Cat> cats = createCats ();
        Set<Dog> dogs = createDogs ();
        Set<Object> pets = join (cats, dogs);
        printPets (pets);
        removeCats (pets, cats);
        printPets (pets);
    }


    public static Set<Cat> createCats () {
        Set<Cat> cats = new HashSet<> ();
        cats.add (new Cat ());
        cats.add (new Cat ());
        cats.add (new Cat ());
        cats.add (new Cat ());
        return cats;
    }

    public static Set<Dog> createDogs () {
        Set<Dog> dogs = new HashSet<> ();
        dogs.add (new Dog ());
        dogs.add (new Dog ());
        dogs.add (new Dog ());
        return dogs;
    }

    public static Set<Object> join (Set<Cat> cats, Set<Dog> dogs) {
        Set<Object> pets = new HashSet<> ();
        pets.addAll (cats);
        pets.addAll (dogs);
        return pets;
    }

    public static void removeCats (Set<Object> pets, Set<Cat> cats) {
        pets.removeAll (cats);
    }

    public static void printPets (Set<Object> pets) {
        for (Object elem : pets) {
            System.out.println (elem);
        }
    }

    public static class Cat {
    }

    public static class Dog {
    }

}