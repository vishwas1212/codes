package coding;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSortArrayWithoutZero {
    public static void main(String[] args) {
        int[] arr1 = {1, 5, 6, 2, 0, 0, 0};
        int[] arr2 = {2, 3, 4, 1};

        int i = 0, j = 0;
       // i =4, j=4
        for (int x : arr1) {
            if (x > 0) {
                i++;
            }
        }

        for (int x : arr2) {
            if (x > 0) {
                j++;
            }
        }
        int[] temp1 = new int[i]; // temp1.length = 4
        int[] temp2 = new int[j]; // temp2.length = 4

        int k = 0, l = 0;
        for (int x : arr1) {
            if (x > 0) {
                temp1[k] = x;
                k++;
            }
        }
        for (int x : arr2) {
            if (x > 0) {
                temp2[l] = x;
                l++;
            }
        }
        System.out.println(Arrays.toString(temp1));
        System.out.println(Arrays.toString(temp2));

        int[] arr3 = new int[temp1.length + temp2.length]; // length = 8

        int m = 0;
        for (int a = 0; a < arr3.length; a++) {
            if (a < temp1.length) {
                arr3[a] = temp1[a];
            } else {
                arr3[a] = temp2[m];
                m++;
            }
        }
        System.out.println(Arrays.toString(arr3));
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));
    }
}
