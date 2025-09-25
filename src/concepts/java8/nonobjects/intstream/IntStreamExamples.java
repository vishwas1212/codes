package concepts.java8.nonobjects.intstream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStreamExamples {
    static void main() {
        // 1. Sum of digits
        int sumOfDigits = IntStream.of(12345)
                .map(s -> String.valueOf(s).chars().map(c -> c - '0').sum())
                .findFirst().getAsInt();
        System.out.println("Sum of digits (12345): " + sumOfDigits);

        // 2. Factorial
        int factorial = IntStream.rangeClosed(1, 5).reduce(1, (a, b) -> a * b);
        System.out.println("Factorial of 5: " + factorial);

        // 3. Prime check
        int num = 29;

        boolean isPrime = num > 1 && IntStream.rangeClosed(2, (int) Math.sqrt(num))
                .noneMatch(i -> num % i == 0);

        System.out.println("Is 29 prime? " + isPrime);

        // 4. Reverse number
        int rev = Integer.parseInt(new StringBuilder("12345").reverse().toString());
        System.out.println("Reverse of 12345: " + rev);

        // 5. Palindrome check
        int palNum = 12321;
        boolean isPalindrome = String.valueOf(palNum).
                contentEquals(new StringBuilder(String.valueOf(palNum)).reverse());
        System.out.println("Is 12321 palindrome? " + isPalindrome);

        // 6. Fibonacci series
        System.out.print("Fibonacci (first 10): ");

        Stream.iterate( new int[]{0, 1}, f -> new int[]{f[1], f[0] + f[1]})
                .limit(10)
                .map(f -> f[0])
                .forEach(n -> System.out.print(n + " "));
        System.out.println();
    }
}
