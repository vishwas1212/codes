package concepts.strings;

public class LongestPalindrome {
    public static void main(String[] args) {
        String input = "abababcabcdefggh";

        int start = 0, maxLen = 1;

        for (int i = 0; i < input.length(); i++) {
            start = expand(input, i, i, start, maxLen)[0];
            maxLen = expand(input, i, i, start, maxLen)[1];
            start = expand(input, i, i + 1, start, maxLen)[0];
            maxLen = expand(input, i, i + 1, start, maxLen)[1];
        }
        System.out.println(input.substring(start, start + maxLen));
    }

    private static int[] expand(String input, int l, int r, int start, int maxLen) {
        while (l >= 0 && r < input.length() && input.charAt(l) == input.charAt(r)) {
            if (r - l + 1 > maxLen) {
                maxLen = r - l + 1;
                start = l;
            }
            l--;
            r++;
        }
        return new int[]{start, maxLen};
    }


}
