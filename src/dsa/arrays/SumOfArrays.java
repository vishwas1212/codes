package dsa.arrays;

import java.util.Scanner;

public class SumOfArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int arr1[] = new int[n1];
        int arr2[] = new int[n2];
        int max = Math.max(n1, n2);
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scan.nextInt();
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scan.nextInt();
        }
        int arrSum = 0;
        int l1 = arr1.length;
        int l2 = arr2.length;
        int pow = 1;
        int c = 0;
        int a1 = 0;
        int a2 = 0;
        while (l1 >= 0 || l2 >= 0) {
            if (l1 > 0)
                a1 = arr1[l1 - 1];
            else
                a1 = 0;
            if (l2 > 0)
                a2 = arr2[l2 - 1];
            else
                a2 = 0;
            int sum = a1 + a2 + c;
            c = sum / 10;
            sum = sum % 10;
            arrSum += sum * pow;
            pow = pow * 10;
            l1--;
            l2--;
        }
        if (c != 0) {
            arrSum += c * pow;
        }
        System.out.println(arrSum);
    }
}
