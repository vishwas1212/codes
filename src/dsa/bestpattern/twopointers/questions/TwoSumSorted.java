package dsa.bestpattern.twopointers.questions;

public class TwoSumSorted {
    static void main() {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        int l = 0, r = arr.length - 1;

        while (l < r) {
            int sum = arr[l] + arr[r];
            if (sum == target) {
                System.out.println("Indices are " + l + " " + r);
                System.out.println("Values are " + arr[l] + " " + arr[r]);
                return;
            } else if (sum < target) {
                l++;
            } else {
                r--;
            }
        }
        System.out.println(" Not Found ");

    }
}
