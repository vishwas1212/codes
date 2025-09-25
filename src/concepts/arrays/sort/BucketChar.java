package concepts.arrays.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BucketChar {
    public static void main(String[] args) {
        char[] arr = {'d', 'a', 'c', 'b', 'a', 'e', 'z', 'y'};
        bucketSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void bucketSort(char[] arr) {
        int n = arr.length;

        //Creation of the bucket
        List<List<Character>> buckets = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            buckets.add(new ArrayList<>());
        }

        for (char ch : arr) {
            int idx = ch - 'a';
            buckets.get(idx).add(ch);
        }

        for (List<Character> bucket : buckets) {
            insertionCharSort(bucket);
        }

        int k = 0;
        for (List<Character> bucket : buckets) {
            for (Character ch : bucket) {
                arr[k++] = ch;
            }

        }


    }

    private static void insertionCharSort(List<Character> list) {
        for (int i = 0; i < list.size(); i++) {
            char key = list.get(i);
            int j = i - 1;
            while (j >= 0 && list.get(j) > key) {
                list.set(j + 1, list.get(j));
                j--;
            }
            list.set(j + 1, key);
        }
    }
}
