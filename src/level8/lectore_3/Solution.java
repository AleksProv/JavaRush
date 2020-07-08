package level8.lectore_3;
/*
Set из растений.
 */

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main (String[] args) {
        Set<String> set = new HashSet<> ();
        set.add ("арбуз");
        set.add ("банан");
        set.add ("вишня");
        set.add ("груша");
        set.add ("дыня");
        set.add ("ежевика");
        set.add ("женьшень");
        set.add ("земляника");
        set.add ("ирис");
        set.add ("картофель");
        for (String s : set) {
            System.out.println (s);
        }
    }
}