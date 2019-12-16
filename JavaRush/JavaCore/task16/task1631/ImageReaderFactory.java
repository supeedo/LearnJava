package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {
    public static ImageReader getImageReader( ImageTypes image) throws IllegalArgumentException{
        if (image != null) {
            try {
                if (image == ImageTypes.BMP) {
                    return new BmpReader();
                }
                if (image == ImageTypes.JPG) {
                    return new JpgReader();
                }
                if (image == ImageTypes.PNG) {
                    return new PngReader();
                }
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            }
        }
        else throw new IllegalArgumentException("Неизвестный тип картинки");
        return null;

    }
}
