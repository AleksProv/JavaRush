package javacore.level5.lectore_12.constructor;

public class SubSolution extends Solution{

    protected SubSolution(String name, String fio) {
        super(name, fio);
    }

    public SubSolution(int age, String name, String fio, String work) {
        super(age, name, fio, work);
    }


    SubSolution(int age, String fio, String work) {
        super(age, fio, work);
    }
}