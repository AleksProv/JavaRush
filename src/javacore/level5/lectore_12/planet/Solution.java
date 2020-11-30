package javacore.level5.lectore_12.planet;

/*
Закрепляем паттерн Singleton
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
    }

    public static Planet thePlanet;

    static {
        try {
            readKeyFromConsoleAndInitPlanet();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readKeyFromConsoleAndInitPlanet() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String pole = reader.readLine();
        switch (pole) {
            case Planet.EARTH:
                thePlanet = Earth.getInstance();
                break;
            case Planet.MOON:
                thePlanet = Moon.getInstance();
                break;
            case Planet.SUN:
                thePlanet = Sun.getInstance();
                break;
            default:
                thePlanet = null;
                break;
        }
        reader.close();
    }
}