package dsa.numbers;

import java.util.Scanner;

public class AnyBaseSubtractionPC {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int b = scan.nextInt();
        int soln = anyBaseSubtraction(n1, n2, b);
        System.out.println(soln);
    }

    private static int anyBaseSubtraction(int n1, int n2, int b) {
        int rv = 0;
        int c = 0;
        int pow = 1;
        while (n1 > 0 || n2 > 0 || c > 0) {
            int d1 = n1 % 10;
            int d2 = n2 % 10;
            n1 = n1 / 10;
            n2 = n2 / 10;
            int d = 0;
            d1 = d1 + c;
            if (d1 >= d2) {
                d = d1 - d2;
                c = 0;
            } else {
                d = d1 + b - d2;
                c = -1;
            }
            rv += d * pow;
            pow = pow * 10;
        }
        return rv;
    }
}
