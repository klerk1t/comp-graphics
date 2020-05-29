import java.awt.Color;

public class GrayLevel {

    public Picture grayLevel(Picture picture) {
        int width    = picture.width();
        int height   = picture.height();
        Picture picture1 = new Picture(width, height);
        // convert to grayscale
        for (int col = 0; col < width; col++) {
            for (int row = 0; row < height; row++) {
                Color color = picture.get(col, row);
                Color gray = Luminance.toGray(color);
                picture1.set(col, row, gray);
            }
        }
        return picture1;
    }

}
