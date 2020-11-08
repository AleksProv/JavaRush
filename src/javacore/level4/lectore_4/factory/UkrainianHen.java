package javacore.level4.lectore_4.factory;

public class UkrainianHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 15;
    }

    @Override
    String getDescription() {
        return super.getDescription() + String.format(" Моя страна - %s. Я несу %d яиц в месяц.", Country.UKRAINE, getCountOfEggsPerMonth());
    }
}