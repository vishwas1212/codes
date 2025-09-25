package dsa.bestpattern.twopointers.questions;

import java.util.Arrays;

public class PreSuffixMax {
    static void main() {
        int[] arr = {2, 1, 0, 5, 3};
        int[] prefixMax = new int[arr.length];
        int[] suffixMax = new int[arr.length];

        prefixMax[0] = arr[0];
        suffixMax[arr.length - 1] = arr[arr.length - 1];
        int p = 1, s = arr.length - 2;

        while (p < arr.length) {
            prefixMax[p] = Math.max(prefixMax[p - 1], arr[p]);
            p++;
        }

        while (s >= 0) {
            suffixMax[s] = Math.max(suffixMax[s + 1], arr[s]);
            s--;
        }
        System.out.println(Arrays.toString(prefixMax));
        System.out.println(Arrays.toString(suffixMax));
    }
}
