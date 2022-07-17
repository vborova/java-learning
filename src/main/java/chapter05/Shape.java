package chapter05;

public abstract class Shape {
    private final static String first = "string1";
    private final static String second;

    static {
        second = "string2";
    }

    protected final String color;

    public Shape(String color) {
        this.color = color;
    }

    public String paint() {
        return "I am Shape";
    }
}
