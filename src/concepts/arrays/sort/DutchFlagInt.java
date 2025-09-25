package concepts.arrays.sort;

import java.util.Arrays;

public class DutchFlagInt {
    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 3, 3, 1};

        int idx = 0, mid = 0;
        int lastIdx = arr.length - 1;

        while (mid <= lastIdx) {
            if (arr[mid] == 1) {
                int temp = arr[idx];
                arr[idx] = arr[mid];
                arr[mid] = temp;
                idx++;
                mid++;
            } else if (arr[mid] == 2) {
                mid++;
            } else if (arr[mid] == 3) {
                mid++;
            } else if (arr[mid] == 4) {
                int temp = arr[lastIdx];
                arr[lastIdx] = arr[mid];
                arr[mid] = temp;
                lastIdx--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
