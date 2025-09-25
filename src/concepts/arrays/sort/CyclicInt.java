package concepts.arrays.sort;

import java.util.Arrays;

public class CyclicInt {
    public static void main(String[] args) {
        int[] arr = {4, 4, 2, 2, 8, 3, 3, 1};

        for (int i = 0; i < arr.length; ) {
            int correctIdx = arr[i] - 1;
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correctIdx]) {
                int temp = arr[i];
                arr[i] = arr[correctIdx];
                arr[correctIdx] = temp;
            } else {
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
