package concepts.arrays.sort;

import java.util.Arrays;

public class RadixInt {
    public static void main(String[] args) {
        int[] arr = {4, 4, 2, 2, 8, 3, 3, 1, 2, 12, 3, 434, 5, 1, 1};
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }

        for (int exp = 1; max / exp > 0; exp *= 10) {
            radixSort(arr, exp);
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void radixSort(int[] arr, int exp) {
        int[] output = new int[arr.length];
        int[] count = new int[10];

        //freq count
        for (int i = 0; i < arr.length; i++) {
            int dig = (arr[i] / exp) % 10;
            count[dig]++;
        }

        //prefix sum
        for (int i = 1; i < 10; i++) {
            count[i] = count[i] + count[i - 1];
        }

        //output creation
        for (int i = arr.length - 1; i >= 0; i--) {
            int dig = (arr[i] / exp) % 10;
            output[count[dig] - 1] = arr[i];
            count[dig]--;
        }

        //copy back
        for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }

    }

}
