package chapter02;

public class Exercise {
    private static int factorial1(int number) {
        int result = 1;

        for (int i = 1; i <= number; i++) {
            result *= i;
        }

        return result;
    }

    private static int factorial2(int number) {
        if (number <= 1) {
            return 1;
        } else {
            return factorial2(number - 1) * number;
        }
      }

    public static void main(String[] args) {
        System.out.printf("Factorial (variant 1): %d\n", factorial1(5));
        System.out.printf("Factorial (variant 2): %d\n", factorial2(5));
    }
}
