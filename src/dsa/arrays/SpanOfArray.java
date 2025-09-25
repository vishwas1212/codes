package dsa.arrays;

import java.util.Scanner;

public class SpanOfArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        int soln = findSpanOfArray(arr, scan);
        System.out.println(soln);
    }

    private static int findSpanOfArray(int[] arr, Scanner scan) {
        int rv = 0;
        int max = 0;
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        min = arr[0];
        max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(max + " " + min);
        rv = max - min;
        return rv;
    }
}
