package chapter03;

public class Exercise {
    private static int function1(int value) {
        if (value < 0) {
            return (value + 1) * 2;
        } else {
            return ++value % 42;
        }
    }

    private static int function2(int value) {
        return (value < 0) ? ((value + 1) * 2) : (++value % 42);
    }

    public static void main(String[] args) {
        System.out.printf("function1(-5): %d, function2(-5): %d\n", function1(-5), function2(-5));
        System.out.printf("function1(0): %d, function2(0): %d\n", function1(0), function2(0));
        System.out.printf("function1(5): %d, function2(5): %d\n", function1(5), function2(5));
        System.out.printf("function1(48): %d, function2(48): %d\n", function1(48), function2(48));
    }
}
