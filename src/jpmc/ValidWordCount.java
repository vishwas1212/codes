package jpmc;

/*
A word is valid if:

It has at least 3 characters.

It contains only alphanumeric characters (a-z, A-Z, 0-9).

It contains at least one vowel (a, e, i, o, u, case-insensitive).

It contains at least one consonant (a-z letter but not a vowel, case insensitive).
 */
public class ValidWordCount {
    public static void main(String[] args) {
        String input = "Hello ANDF this is cat to be checked 1234abc";
        int count = validWordCount(input);
        System.out.println("Valid Count is: " + count);
    }

    private static int validWordCount(String input) {
        if (input == null || input.isEmpty()) return 0;

        String[] words = input.split("\\s+");

        int validCounts = 0;
        for (String word : words) {
            if (isValid(word)) {
                validCounts++;
            }
        }
        return validCounts;
    }

    private static boolean isValid(String word) {
        if (word.length() < 3) return false;

        if (!word.matches("[a-zA-Z0-9]+")) return false;

        boolean hasVowel = false, hasConstant = false;

        for (char c : word.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                if ("aeiou".indexOf(c) >= 0) {
                    hasVowel = true;
                } else {
                    hasConstant = true;
                }
            }
        }
        return hasVowel && hasConstant;
    }
}
