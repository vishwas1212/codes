package dsa.pattern;

import java.util.Scanner;

public class DiagonalPatternLeftTop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sp = 0;
        int st = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print("--\t");
            }
            for (int k = 1; k <= st; k++) {
                System.out.print("*\t");
            }
            sp++;
            System.out.println();
        }
    }
}
