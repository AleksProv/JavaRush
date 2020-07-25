package level8.lectore_8;

/*
добрая Зинаида и летние каникулы.
 */

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Solution_4 {
    public static Map<String, Date> createMap () throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat ("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<> ();
        map.put ("Сталлоне", dateFormat.parse ("MAY 1 2012"));
        map.put ("Сталлоне2", dateFormat.parse ("MARCH 2 2012"));
        map.put ("Сталлоне3", dateFormat.parse ("MAY 2 2012"));
        map.put ("Сталлоне4", dateFormat.parse ("JUNE 2 2012"));
        map.put ("Сталлоне5", dateFormat.parse ("MAY 2 2012"));
        map.put ("Сталлоне6", dateFormat.parse ("MAY 2 2012"));
        map.put ("Сталлоне7", dateFormat.parse ("JULY 2 2012"));
        map.put ("Сталлоне8", dateFormat.parse ("MAY 2 2012"));
        map.put ("Сталлоне9", dateFormat.parse ("MAY 2 2012"));
        map.put ("Сталлоне10", dateFormat.parse ("AUGUST 2 2012"));
        return map;
    }

    public static void removeAllSummerPeople (Map<String, Date> map) {
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet ().iterator ();
        while (iterator.hasNext ()) {
            Map.Entry<String, Date> item = iterator.next ();
            if (item.getValue ().getMonth () > 4 && item.getValue ().getMonth () < 8) {
                iterator.remove ();
            }
        }
    }

    public static void main (String[] args) throws ParseException {
        removeAllSummerPeople (createMap ());
    }
}