package concepts.arrays.sort;

import java.util.Arrays;

public class SelectionInt {
    public static void main(String[] args) {
        int[] arr = {4, 4, 2, 2, 8, 3, 3, 1};
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
                int temp = arr[minIdx];
                arr[minIdx] = arr[i];
                arr[i] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
