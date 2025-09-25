package dsa.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SwapInArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("Before Swapping: " + Arrays.toString(arr));
        swapArray(arr, 0, arr.length);
        System.out.println("After Swapping: " + Arrays.toString(arr));

    }

    private static void swapArray(int[] arr, int i, int length) {
        int temp = arr[i];
        arr[i] = arr[length - 1];
        arr[length - 1] = temp;
    }
}
