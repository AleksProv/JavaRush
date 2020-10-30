package javacore.level3.lectore_2;

/*
Будующий управленец
 */

public class Solution_3 {
    public static void main(String[] args) {
    }

    interface Person {
        void use(Person person);
        void startToWork();
    }

    interface HasManagementPotential {
        boolean inspiresOthersToWork();
    }

    interface Secretary extends Person{
    }

    interface Boss extends HasManagementPotential, Person{
    }

    class Manager implements Boss{
        public void use(Person person) {
            person.startToWork();
        }

        public void startToWork() {
        }

        public boolean inspiresOthersToWork() {
            return true;
        }
    }

    class Subordinate implements Secretary{
        public void use(Person person) {
        }

        public void startToWork() {
        }
    }
}
