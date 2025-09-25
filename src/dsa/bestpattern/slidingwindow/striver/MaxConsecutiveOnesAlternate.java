package dsa.bestpattern.slidingwindow.striver;

public class MaxConsecutiveOnesAlternate {
    static void main() {
        int[] arr = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k = 2;

        int maxLen = 0, l = 0, r = 0, zeros = 0;
        while (r < arr.length) {
            if (arr[r] == 0) {
                zeros++;
            }
            while (zeros > k) {
                if (arr[l] == 0) {
                    zeros--;
                }
                l++;
            }

            maxLen = Math.max(maxLen, r - l + 1);
            r++;
        }
        System.out.println(maxLen);
    }
}
