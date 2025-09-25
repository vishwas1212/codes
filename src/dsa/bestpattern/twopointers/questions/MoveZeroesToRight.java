package dsa.bestpattern.twopointers.questions;

import java.util.Arrays;

public class MoveZeroesToRight {
    static void main() {
        int[] arr = {0, 1, 0, 3, 12, 0};
        int l = 0, r = 0;

        while (r < arr.length) {
            if (arr[r] != 0) {
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
            }
            System.out.println(Arrays.toString(arr));
            r++;
        }
        System.out.println(Arrays.toString(arr));

    }
}
