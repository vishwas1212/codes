package dsa.numbers;

import java.util.Scanner;

public class AnyBaseToDecimal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int b = scan.nextInt();
        int soln = anyBaseToDecimal(n, b);
        System.out.println(soln);
    }

    private static int anyBaseToDecimal(int n, int b) {
        int res = 0;
        int pow = 1;
        while (n > 0) {
            int f = n % 10;
            n = n / 10;
            res = res + f * pow;
            pow = pow * b;
        }
        return res;
    }
}
