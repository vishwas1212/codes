package dsa.pattern;

import java.util.Scanner;

public class HollowDiamond1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int st = 1;
        int isp = -1;
        int osp = n / 2;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= osp; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= st; j++) {
                System.out.print("*\t");
            }
            for (int j = 1; j <= isp; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= st; j++) {
                if (i != 1 && i != n)
                    System.out.print("*\t");
            }
            if (i <= n / 2) {
                osp--;
                isp += 2;
            } else {
                osp++;
                isp -= 2;
            }
            System.out.println();
        }
    }
}
