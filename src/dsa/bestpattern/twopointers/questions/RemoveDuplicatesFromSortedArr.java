package dsa.bestpattern.twopointers.questions;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArr {
    static void main() {
        int[] arr = {1, 1, 1, 2, 2, 3, 3, 4, 5, 5};
        int l = 0, r = 1;

        while (r < arr.length) {
            if (arr[r] != arr[l]) {
                l++;
                 arr[l] = arr[r];
            }
            r++;
        }

        System.out.println(Arrays.toString(Arrays.copyOfRange(arr, 0, l + 1)));
    }
}
