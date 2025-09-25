package concepts.arrays.sort;

import java.util.Arrays;

/*
In this approach we find max.
find the frequency.
and then assign the index to the array
this works for small range integers
 */
public class CountingInt {
    public static void main(String[] args) {
        int[] arr = {4, 4, 2, 2, 8, 3, 3, 1, 7, 8, 5, 4, 3, 2, 1, 455, 890};
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        int[] count = new int[max + 1];

        //freq find
        for (int i : arr) {
            count[i]++;
        }

        //setting back the array
        int idx = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[idx++] = i;
                count[i]--;
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
