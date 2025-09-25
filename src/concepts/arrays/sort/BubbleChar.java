package concepts.arrays.sort;

import java.util.Arrays;

public class BubbleChar {
    public static void main(String[] args) {

        char[] arr = {'a', 'b', 'c', 'a', 'b', 'd'};
        boolean swapped;

        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    char temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
