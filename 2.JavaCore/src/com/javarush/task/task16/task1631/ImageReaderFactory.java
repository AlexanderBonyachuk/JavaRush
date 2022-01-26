package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {


    public static ImageReader getImageReader(ImageTypes type) {
        ImageReader a = null;

        if ((type == ImageTypes.BMP) || (type == ImageTypes.JPG) || (type == ImageTypes.PNG)) {
            if (type == ImageTypes.BMP) {
                a = new BmpReader();
            }
            if (type == ImageTypes.JPG) {
                a =  new JpgReader();
            }
            if (type == ImageTypes.PNG) {
                a =  new PngReader();
            }
        } else {
//            System.out.println("Ошибка");
            throw new IllegalArgumentException();
//            break;
        }
        return a;
    }
}
