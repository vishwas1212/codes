package dsa.bestpattern.slidingwindow.striver;

public class LongestStringBruteForce {
    static void main() {
        String s = "cadbzabcd";
        int maxLen = 0;

        for (int i = 0; i < s.length(); i++) {
            int[] hash = new int[256];
            for (int j = i; j < s.length(); j++) {

                if (hash[s.charAt(j)] == 1) {
                    break;
                }
                hash[s.charAt(j)] = 1;
                maxLen = Math.max(maxLen, j - i + 1);
            }
        }
        System.out.println(maxLen);
    }
}
