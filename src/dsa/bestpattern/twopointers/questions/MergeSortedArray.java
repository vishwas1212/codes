package dsa.bestpattern.twopointers.questions;

import java.util.Arrays;

public class MergeSortedArray {
    static void main() {
        int[] n1 = {4, 5, 6, 0, 0, 0};
        int[] n2 = {1, 2, 3};

        int m = 3, n = 3;
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (n1[i] > n2[j]) {
                n1[k--] = n1[i--];
            } else {
                n1[k--] = n2[j--];
            }
        }
        while (j >= 0) {
            n1[k--] = n2[j--];
        }
        System.out.println(Arrays.toString(n1));

    }
}
