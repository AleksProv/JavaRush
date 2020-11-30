package javacore.level5.lectore_12.peregrus;

/*
ООП. Перегрузка
 */

import java.math.BigDecimal;

public class Solution {
    public static void main(String[] args) {
        new Tree().info((Object) new Integer("4"));
        new Tree().info((Object) new Short("4"));
        new Tree().info((Object) new BigDecimal("4"));

        new Tree().info(new Integer("4"));
        new Tree().info(new Short("4"));
        new Tree().info(new BigDecimal("4"));

        new Tree().info("4");
        new Tree().info(new Integer("4").toString());
        new Tree().info(new Short("4").toString());
        new Tree().info(new BigDecimal("4").toString());
    }
}