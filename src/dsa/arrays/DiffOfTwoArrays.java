package dsa.arrays;

import java.util.Scanner;

public class DiffOfTwoArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int arr1[] = new int[n1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scan.nextInt();
        }

        int n2 = scan.nextInt();
        int arr2[] = new int[n2];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scan.nextInt();
        }

        int max = (n1 > n2) ? n1 : n2;
        int diffArray[] = new int[max];
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = diffArray.length - 1;
        int d = 0;
        int c = 0;
        while (k >= 0) {
            int d1 = 0, d2 = 0;
            if (i >= 0) {
                d1 = arr1[i];
            }
            if (j >= 0) {
                d2 = arr2[j];
            }
            if (d1 <= d2) {
                d = d1 + 10 - c - d2;
                c = 1;
            } else {
                d = d1 - c - d2;
                c = 0;
            }
            diffArray[k] = d;
            i--;
            j--;
            k--;
        }
        if (c > 0) {
            System.out.print(c);
        }
        int idx = 0;
        while (idx < diffArray.length) {
            if (diffArray[idx] == 0) {
                idx++;
            } else {
                break;
            }
        }

        while (idx < diffArray.length) {
            System.out.print(diffArray[idx]);
            idx++;
        }
    }
}
