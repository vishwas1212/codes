package dsa.pattern;

import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sp = n / 2;
        int st = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            for (int k = 1; k <= st; k++) {
                System.out.print("*\t");
            }
            if (i <= n / 2) {
                st += 2;
                sp--;
            } else {
                st -= 2;
                sp++;
            }
            System.out.println();
        }
    }
}
