package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

/**
 * Created by vladislavklockov on 14.05.17.
 */
public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes imageTypes) {

            if (imageTypes == imageTypes.JPG) {
                return new JpgReader();
            } else if (imageTypes == imageTypes.BMP) {
                return new BmpReader();
            } else if (imageTypes == imageTypes.PNG) {
                return new PngReader();
            }
        throw new IllegalArgumentException("Неизвестный тип картинки");
    }
}
