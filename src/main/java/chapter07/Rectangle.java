package chapter07;

public class Rectangle {
    private final Shape shape;

    public Rectangle(String color) {
        this.shape = new Shape(color);
    }

    public String getColor() {
        return shape.getColor();
    }

    public void setColor(String color) {
        shape.setColor(color);
    }

    public Shape getShape() {
        return shape;
    }
}
