package dsa.bestpattern.slidingwindow.striver;

public class LongestRepeatingCharacterRepl {
    static void main() {
        String input = "AAABABBA";
        int k = 2;

        int l = 0, r = 0, maxLen = 0, maxFreq = 0, idx = 0;
        int[] hash = new int[26];

        while (r < input.length()) {
            hash[input.charAt(r) - 'A']++;
            maxFreq = Math.max(maxFreq, hash[input.charAt(r) - 'A']);

            if ((r - l + 1) - maxFreq > k) {
                hash[input.charAt(l) - 'A']--;
                 maxFreq = 0;
                l++;
            }
            if ((r - l + 1) - maxFreq <= k) {
                maxLen = Math.max(r - l + 1, maxLen);
                idx = l;
            }
            r++;
        }
        System.out.println(input.substring(idx, idx + maxLen));
        System.out.println(maxLen);
    }

}
