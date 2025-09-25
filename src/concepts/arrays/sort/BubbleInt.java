package concepts.arrays.sort;

import java.util.Arrays;

public class BubbleInt {
    public static void main(String[] args) {
        int[] arr = {4, 4, 2, 2, 8, 3, 3, 1};
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
        System.out.println(Arrays.toString(arr));
    }
}
