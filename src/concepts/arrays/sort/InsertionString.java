package concepts.arrays.sort;

import java.util.Arrays;

public class InsertionString {
    public static void main(String[] args) {
        //   String[] arr = {"bca", "apple", "dog", "cat"};
        //  String[] arr = {"apple", "ant", "a", "apricot", "anchor"};
        String[] arr = {"Alice", "Aaron", "Ava", "Aiden", "Ariana"};
        for (int i = 0; i < arr.length; i++) {
            String key = arr[i];
            int j = i - 1;

            while (j >= 0 && comparableString(arr[j], key) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

        System.out.println(Arrays.toString(arr));
    }

    private static int comparableString(String a, String b) {
        int len = Math.min(a.length(), b.length());
        for (int i = 0; i < len; i++) {
            if (a.charAt(i) != b.charAt(i)) {
                return a.charAt(i) - b.charAt(i);
            }
        }
        return a.length() - b.length();
    }
}
