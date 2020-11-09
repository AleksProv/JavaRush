package javacore.level4.lectore_8.drink;
/*
Дегустация вин
 */

public class Solution {
    public static void main(String[] args) {
        getDeliciosDrink().taste();
        System.out.println(getWine().getHolidayName());
        System.out.println(getBubblyWine().getHolidayName());
        System.out.println(getWine().getHolidayName());
    }

    public static Drink getDeliciosDrink(){
        return new Wine();
    }

    public static Wine getWine(){
        return new Wine();
    }

    public static Wine getBubblyWine(){
        return new BubblyWine();
    }

}