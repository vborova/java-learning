package chapter05;

import java.util.Arrays;

public class Exercise {
    public static void main(String[] args) {
        Circle c1 = new Circle("blue", 10);
        Circle c2 = new Circle("yellow", 42);
        Rectangle r = new Rectangle("green", 10, 15);
        Shape[] shapes = new Shape[]{c1, c2, r};

        shapes[1] = new Rectangle("red", 12, 5);

        System.out.println(c1.paint());
        System.out.println(shapes[2].paint());
        System.out.println(Arrays.toString(shapes));
    }
}
