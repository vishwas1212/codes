package dsa.arrays;

import java.util.Scanner;

public class FindElementInArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int d = scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == d) {
                idx = i;
                break;
            } else {
                idx = -1;
            }
        }
        System.out.println(idx);

    }
}
