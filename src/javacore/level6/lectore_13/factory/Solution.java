package javacore.level6.lectore_13.factory;

/*
Factory method pattern
 */

import javacore.level6.lectore_13.factory.common.ImageReader;
import javacore.level6.lectore_13.factory.common.ImageTypes;

public class Solution {
    public static void main(String[] args) {
        ImageReader reader = ImageReaderFactory.getImageReader(ImageTypes.JPG);
    }
}