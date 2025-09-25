package dsa.pattern;

import java.util.Scanner;

public class FobonacciTraiangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int f1 = 0;
        int f2 = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(f1 + "\t");
                int sum = f1 + f2;
                f1 = f2;
                f2 = sum;
            }
            System.out.println();
        }
    }
}
