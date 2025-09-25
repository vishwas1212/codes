package concepts.arrays.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BucketInt {
    public static void main(String[] args) {
        int[] arr = {4, 4, 2, 2, 8, 300, 3, 1000};

        int max = arr[0], min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }
        int len = arr.length;
        int bucketCount = max - min + 1;

        List<List<Integer>> buckets = new ArrayList<>();
        for (int i = 0; i < bucketCount; i++) {
            buckets.add(new ArrayList<>());
        }

        for (int num : arr) {
            int bucketIndex = num - min;
            buckets.get(bucketIndex).add(num);
        }

        for (List<Integer> bucket : buckets) {
            insertionSort(bucket);
        }

        int idx = 0;
        for (List<Integer> bucket : buckets) {
            for (int num : bucket) {
                arr[idx] = num;
                idx++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int key = list.get(i);
            int j = i - 1;

            while (j >= 0 && list.get(j) > key) {
                list.set(j + 1, list.get(j));
                j--;
            }
            list.set(j + 1, key);
        }
    }
}
