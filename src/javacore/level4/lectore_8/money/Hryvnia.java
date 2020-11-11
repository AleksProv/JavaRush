package javacore.level4.lectore_8.money;

public class Hryvnia extends Money{

    public Hryvnia(double amount) {
        super(amount);
    }

    @Override
    public String getCurrencyName() {
        return "UAH";
    }
}