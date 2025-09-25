package dsa.pattern;

import java.util.Scanner;

public class DiagonalPatternLeftTopPC {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sp = 0;
        int st = 1;
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n; k++) {
                if (i == k)
                    System.out.print("*\t");
                else
                    System.out.print("\t");
            }

            System.out.println();
        }
    }
}
