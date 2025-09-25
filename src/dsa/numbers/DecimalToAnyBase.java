package dsa.numbers;

import java.util.Scanner;

public class DecimalToAnyBase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int cb = scan.nextInt();
        int soln = findBase(n, cb);
             System.out.println(soln);
    }
    private static int findBase(int n, int cb) {
        int res = 0;
        int powr = 1;
        while (n > 0) {
            int f = n % cb;
            n = n / cb;
            res = res + f * powr;
            powr = powr * 10;
        }
        return res;
    }
}
