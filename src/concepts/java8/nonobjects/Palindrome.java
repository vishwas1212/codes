package concepts.java8.nonobjects;

import java.util.stream.IntStream;

public class Palindrome {
    public static void main(String[] args) {
        String str = "JAHAJ";

        boolean isPalindrome = IntStream.rangeClosed(0, str.length() / 2)
                .noneMatch(i -> str.charAt(i) != str.charAt(str.length() - i - 1));
        if (isPalindrome) {
            System.out.println(isPalindrome);
        } else {
            System.out.println(isPalindrome);
        }
    }
}
