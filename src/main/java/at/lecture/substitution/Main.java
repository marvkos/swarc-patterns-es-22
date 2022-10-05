package at.lecture.substitution;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = getInstance(10, 20);

        test(rectangle, 20, 10);

        Square square = new Square();
        square.setWidth(10);
        square.setHeight(20);

        test(square, 20, 10);
    }

    public static void test(Rectangle rectangle, int h,int w) {
        if (rectangle.getHeight() != h
                || rectangle.getWidth() != w) {
            throw new RuntimeException("failed");
        }
    }

    public static Rectangle getInstance(int width, int height) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(width);
        rectangle.setHeight(height);

        return rectangle;
    }
}
