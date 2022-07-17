package chapter05;

public class Circle extends Shape {
    private final int radius;

    Circle(String color, int radius) {
        super(color);

        this.radius = radius;
    }

    @Override
    public String paint() {
        return String.format("I am Circle, radius: %d", radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color=" + color +
                ", radius=" + radius +
                '}';
    }
}
