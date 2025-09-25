package dsa.pattern;

import java.util.Scanner;

public class DiamondNumberPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sp = n / 2;
        int st = 1;
        int rval = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            int cval = rval;
            for (int j = 1; j <= st; j++) {
                System.out.print(cval + "\t");
                if (j <= st / 2) {
                    cval++;
                } else {
                    cval--;
                }
            }
            if (i <= n / 2) {
                sp--;
                st += 2;
                rval++;
            } else {
                sp++;
                st -= 2;
                rval--;
            }
            System.out.println();
        }
    }
}
