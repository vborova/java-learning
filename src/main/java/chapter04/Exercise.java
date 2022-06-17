package chapter04;

import java.util.stream.IntStream;

public class Exercise {
    private static int whileSum(int value1, int value2) {
        int result = 0;

        int i = value1;
        while (i <= value2) {
            result += i;
            i++;
        }

        return result;
    }

    private static int doWhileSum(int value1, int value2) {
        int result = 0;
        int i = value1;

        do {
            result += i;
            i++;
        } while (i <= value2);

        return result;
    }

    private static int forSum(int value1, int value2) {
        int result = 0;

        for (int i = value1; i <= value2; i++) {
            result += i;
        }

        return result;
    }

    private static int forEachSum(int value1, int value2) {
        int result = 0;
        int[] values = IntStream.rangeClosed(value1, value2).toArray();

        for (int value : values) {
            result += value;
        }

        return result;
    }


    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Parameter quantity must not less then 3");
        } else {
            String functionType = args[0];
            int value1 = Integer.parseInt(args[1]);
            int value2 = Integer.parseInt(args[2]);

            switch (functionType) {
                case "0" -> System.out.printf("whileSum: %d\n", whileSum(value1, value2));
                case "1" -> System.out.printf("doWhileSum: %d\n", doWhileSum(value1, value2));
                case "2" -> System.out.printf("forSum: %d\n", forSum(value1, value2));
                default -> System.out.printf("forEachSum: %d\n", forEachSum(value1, value2));
            }
        }
    }
}