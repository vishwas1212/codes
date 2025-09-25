package concepts.arrays.sort;

import java.util.Arrays;

public class InsertionInt {
    public static void main(String[] args) {
        int[] arr = {4, 4, 2, 2, 12, 8, 3, 3, 1, 9, 10, 11};

        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        System.out.println(Arrays.toString(arr));
    }
}
