package concepts.arrays.sort;

import java.util.Arrays;

public class RadixStringDiffLLength {
    public static void main(String[] args) {
        String[] arr = {"bat", "apple", "ant", "a", "ab"};

        radixSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void radixSort(String[] arr) {
        int maxLen = arr[0].length();

        //find max len string in the array
        for (String s : arr) {
            if (maxLen < s.length()) {
                maxLen = s.length();
            }
        }
        //put pad for all the strings so it becomes of same length
        for (int i = 0; i < arr.length; i++) {
            while (arr[i].length() < maxLen) {
                arr[i] = arr[i] + " ";
            }
        }

        for (int pos = maxLen - 1; pos >= 0; pos--) {
            countingSortByChar(arr, pos);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].trim();
        }

    }

    private static void countingSortByChar(String[] arr, int pos) {
        int n = arr.length;
        String[] output = new String[n];
        int[] count = new int[256];

        //find the frequency
        for (String s : arr) {
            count[s.charAt(pos)]++;
        }

        //PREFIX SUM
        for (int i = 1; i < 256; i++) {
            count[i] = count[i] + count[i - 1];
        }

        //create the output array
        for (int i = n - 1; i >= 0; i--) {
            char ch = arr[i].charAt(pos);
            output[count[ch] - 1] = arr[i];
            count[ch]--;
        }

        //back to original array
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }
}
