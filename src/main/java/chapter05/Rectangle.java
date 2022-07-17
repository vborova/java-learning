package chapter05;

public class Rectangle extends Shape {
    private final int width;
    private final int height;

    Rectangle(String color, int width, int height) {
        super(color);

        this.width = width;
        this.height = height;
    }

    @Override
    public String paint() {
        return String.format("I am Rectangle, width: %d, height: %d", width, height);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "color=" + color +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
