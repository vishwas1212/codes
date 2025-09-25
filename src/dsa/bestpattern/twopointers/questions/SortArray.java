package dsa.bestpattern.twopointers.questions;

import java.util.Arrays;

public class SortArray {
    static void main() {
        int[] arr = {9, 7, 5, 3, 1, 4, 6, 2, 8};

        System.out.println(Arrays.toString(arr));
        int k = 0;
        while (k < arr.length) {
            int l = 0, r = 1;
            while (r < arr.length) {
                if (arr[l] > arr[r]) {
                    int temp = arr[l];
                    arr[l] = arr[r];
                    arr[r] = temp;

                }
                l++;
                r++;
            }
            k++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
