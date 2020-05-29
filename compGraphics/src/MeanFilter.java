import java.awt.Color;

public class MeanFilter {

    public Picture meanFilter(Picture picture) {
        int width  = picture.width();
        int height = picture.height();
        Picture picture1 = new Picture(width, height);

        for (int y = 2; y < height - 2; y++) {
            for (int x = 2; x < width - 2; x++) {
                Color c00 = picture.get(x-2, y-2);
                Color c01 = picture.get(x-2, y);
                Color c02 = picture.get(x-2, y+2);
                Color c10 = picture.get(x, y-2);
                Color c11 = picture.get(x, y);
                Color c12 = picture.get(x, y+2);
                Color c20 = picture.get(x+2, y-2);
                Color c21 = picture.get(x+2, y);
                Color c22 = picture.get(x+2, y+2);
                int r = c00.getRed() + c01.getRed() + c02.getRed() +
                        c10.getRed() + c11.getRed() + c12.getRed() +
                        c20.getRed() + c21.getRed() + c22.getRed();
                int g = c00.getGreen() + c01.getGreen() + c02.getGreen() +
                        c10.getGreen() + c11.getGreen() + c12.getGreen() +
                        c20.getGreen() + c21.getGreen() + c22.getGreen();
                int b = c00.getBlue() + c01.getBlue() + c02.getBlue() +
                        c10.getBlue() + c11.getBlue() + c12.getBlue() +
                        c20.getBlue() + c21.getBlue() + c22.getBlue();
                Color c = new Color(r/9, g/9, b/9);
                picture1.set(x, y, c);
            }
           // if (y % 20 == 0) picture2.show();
        }
        return picture1;
    }
}