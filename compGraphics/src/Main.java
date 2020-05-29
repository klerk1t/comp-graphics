public class Main {
    public static void main(String[] args) {
        Picture picture = new Picture("pic1.jpg");
        new GrayLevel().grayLevel(picture).save("gray.jpg");
        new MeanFilter().meanFilter(picture).save("mean.jpg");
        new EdgeDetection().edgeDetection(picture).save("edge.jpg");

    }
}
