package dsa.pattern;

import java.util.Scanner;

public class NumericalRectangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sp = 2 * n - 3;
        int st = 1;
        for (int i = 1; i <= n; i++) {
            int val = 1;
            for (int j = 1; j <= st; j++) {
                System.out.print(val + "\t");
                val++;
            }
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            if (i == n) {
                st--;
                val--;
            }
            for (int j = 1; j <= st; j++) {
                val--;
                System.out.print(val + "\t");
            }
            if (i <= n / 2 + 1) {
                sp -= 2;
                st++;
            }
            System.out.println();
        }
    }
}
