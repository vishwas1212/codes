package concepts.arrays.sort;

import java.util.Arrays;

public class CountChar {
    public static void main(String[] args) {
        char[] arr = {'q', 'a', 'z', 'w', 's', 'x', 'e', 'd', 'c',
                'r', 'f', 'v', 't', 'g', 'b', 'y', 'h', 'n', 'u',
                'j', 'm', 'i', 'k', 'o', 'l', 'p',
                'z', 'd', 'a', 'c', 'b', 'a', 'e', 'z', 'y', 'b', 'c', 'd', 'e', 'a', 'z'};
        countChar(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void countChar(char[] arr) {
        int[] count = new int[26];

        for (char ch : arr) {
            count[ch - 'a']++;
        }

        int idx = 0;
        for (int i = 0; i < 26; i++) {
            while (count[i] > 0) {
                arr[idx++] = (char) (i + 'a');
                count[i]--;
            }
        }

    }
}
