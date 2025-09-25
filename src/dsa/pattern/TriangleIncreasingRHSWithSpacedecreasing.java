package dsa.pattern;

import java.util.Scanner;

public class TriangleIncreasingRHSWithSpacedecreasing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sp = n - 1;
        int st = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = sp; j >= 1; j--) {
                System.out.print("\t");
            }
            for (int k = 1; k <= st; k++) {
                System.out.print("*\t");
            }
            System.out.println();
            sp--;
            st++;
        }
    }
}
