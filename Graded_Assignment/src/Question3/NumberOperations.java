package Question3;

import java.util.Arrays;

public class NumberOperations {
    public static void main(String[] args) {
        Integer[] inputArray = {1, 2, 3, 4, 5};

        int sum = Arrays.stream(inputArray).filter(number -> number % 2 != 0).map(number -> number * number).reduce(0, Integer::sum);

        System.out.println("Input Numbers: " + Arrays.toString(inputArray));
        System.out.println("Odd Numbers: " + Arrays.toString(filterOddNumbers(inputArray)));
        System.out.println("Squares: " + Arrays.toString(squareNumbers(inputArray)));
        System.out.println("Sum: " + sum);
    }

    public static Integer[] filterOddNumbers(Integer[] numbers) {
        return Arrays.stream(numbers).filter(number -> number % 2 != 0).toArray(Integer[]::new);
    }

    public static Integer[] squareNumbers(Integer[] numbers) {
        return Arrays.stream(numbers).map(number -> number * number).toArray(Integer[]::new);
    }
}
