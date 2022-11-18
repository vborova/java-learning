package chapter07;

public class Exercise {
    public static void main(String[] args) {
        Shape s = new Shape("green");
        Circle c = new Circle("red");
        Rectangle r = new Rectangle("blue");

        System.out.printf("Circle color: %s\n", c.getColor());
        System.out.printf("Rectangle color: %s\n", r.getColor());

        printShapeColor(s);
        printShapeColor(c);
        printShapeColor(r.getShape());

        printCircleColor(c);
    }

    public static void printShapeColor(Shape shape) {
        System.out.printf("Shape color: %s\n", shape.getColor());
    }

    public static void printCircleColor(Circle circle) {
        System.out.printf("Circle color: %s\n", circle.getColor());
    }
}
