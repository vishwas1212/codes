package concepts.strings;

import java.util.Arrays;

public class FirstUniqueChar {
    public static void main(String[] args) {
        String input = "abababcabcdefggh";

        int[] freq = new int[256];

        for (char c : input.toCharArray()) {
            freq[c]++;
        }
        char temp = 'a';
        for (int i = 0; i < input.length(); i++) {
            if (freq[input.charAt(i)] == 1) {
                temp = input.charAt(i);
            }
        }
        System.out.println(temp);
    }
}
