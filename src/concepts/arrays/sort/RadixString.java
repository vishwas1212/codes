package concepts.arrays.sort;

import java.util.Arrays;

public class RadixString {
    public static void main(String[] args) {

        String[] arr = {"bca", "abc", "acb", "bac", "cab", "cba"};
        int maxLen = arr[0].length();
        for (int pos = maxLen - 1; pos >= 0; pos--) {
            arr = countingSortByChar(arr, pos);
        }
        System.out.println(Arrays.toString(arr));
    }

    private static String[] countingSortByChar(String[] arr, int pos) {
        String[] output = new String[arr.length];
        int[] count = new int[256];

        // count frequencies
        for (String s : arr) {
            int idx = s.charAt(pos) - 'a';
            count[idx]++;
        }

        // cumulative count
        for (int i = 1; i < count.length; i++) {
            count[i] = count[i] + count[i - 1];
        }

        //build the output array in reverse
        for (int i = arr.length - 1; i >= 0; i--) {
            int idx = arr[i].charAt(pos) - 'a';
            output[count[idx] - 1] = arr[i];
            count[idx]--;
        }

        //copy back into the original array
       /* for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }*/
        return output;
    }
}
