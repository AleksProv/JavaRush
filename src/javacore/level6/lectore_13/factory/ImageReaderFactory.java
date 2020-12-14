package javacore.level6.lectore_13.factory;

import javacore.level6.lectore_13.factory.common.*;

public class ImageReaderFactory {

    private ImageReaderFactory() {
    }

    public static ImageReader getImageReader(ImageTypes types) {
        ImageReader imageReader;

        if (types.equals(ImageTypes.JPG)) {
            imageReader = new JpgReader();
        } else if (types.equals(ImageTypes.BMP)) {
            imageReader = new BmpReader();
        } else if (types.equals(ImageTypes.PNG)) {
            imageReader = new PngReader();
        } else {
            throw new IllegalArgumentException("Неизвестный тип картинки");
        }
        return imageReader;
    }
}