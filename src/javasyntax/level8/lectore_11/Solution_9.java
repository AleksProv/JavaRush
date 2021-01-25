package javasyntax.level8.lectore_11;

/*
Номер месяца.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Solution_9 {
    public static void main (String[] args) throws Exception {
        Map<String,Integer> mesBaza= new HashMap<> ();
        mesBaza.put ("January",1);
        mesBaza.put ("February",2);
        mesBaza.put ("March",3);
        mesBaza.put ("April",4);
        mesBaza.put ("May",5);
        mesBaza.put ("June",6);
        mesBaza.put ("July",7);
        mesBaza.put ("August",8);
        mesBaza.put ("September",9);
        mesBaza.put ("October",10);
        mesBaza.put ("November",11);
        mesBaza.put ("December",12);
        String mes = readString ();
        for (Map.Entry<String, Integer> s : mesBaza.entrySet ()) {
           if (mes.equals (s.getKey ()))
            System.out.println (s.getKey () + " is the " + s.getValue () + " month");
        }
    }

    public static String readString () throws Exception {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        return reader.readLine ();
    }
}