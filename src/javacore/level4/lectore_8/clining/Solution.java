package javacore.level4.lectore_8.clining;

/*
Клининговый центр
 */

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<Apartment> apartments = new ArrayList<>();
        apartments.add(new OneRoomApt());
        apartments.add(new TwoRoomApt());
        apartments.add(new ThreeRoomApt());
        cleanAllApartments(apartments);
    }

    public static void cleanAllApartments(List<Apartment> apartments) {
        for (Apartment pear : apartments) {
            if (pear instanceof OneRoomApt) {
                ((OneRoomApt) pear).clean1Room();
            } else if (pear instanceof TwoRoomApt) {
                ((TwoRoomApt) pear).clean2Rooms();
            } else if (pear instanceof ThreeRoomApt){
                ((ThreeRoomApt) pear).clean3Rooms();
            }
        }
    }


    interface Apartment {
    }


    static class OneRoomApt implements Apartment {
        void clean1Room() {
            System.out.println("1 room is cleaned");
        }
    }


    static class TwoRoomApt implements Apartment {
        void clean2Rooms() {
            System.out.println("2 room is cleaned");
        }
    }

    static class ThreeRoomApt implements Apartment {
        void clean3Rooms() {
            System.out.println("3 room is cleaned");
        }
    }

}