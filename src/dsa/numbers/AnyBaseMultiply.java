package dsa.numbers;

import java.util.Scanner;

public class AnyBaseMultiply {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int b = scan.nextInt();
        int soln = anyBaseMultiply(n1, n2, b);
        System.out.println(soln);
    }

    private static int anyBaseMultiply(int n1, int n2, int b) {
        int rv = 0;
        int c = 0;
        int temp = n1;
        int firstRes = 0;
        int powr = 1;
        while (n2 > 0) {
            int d2 = n2 % 10;
            n2 = n2 / 10;
            if (n1 == 0) {
                n1 = temp;
            }

            int pow = 1;
            while (n1 > 0 || c > 0) {
                int d1 = n1 % 10;
                n1 = n1 / 10;
                int mul = d1 * d2 + c;
                int d = 0;
                if (mul < b) {
                    d = mul;
                    c = 0;
                } else {
                    d = mul % b;
                    c = mul / b;
                }
                firstRes += d * pow;
                pow = pow * 10;
            }
            rv = anyBaseAddition(firstRes * powr, rv, b);
            firstRes = 0;
            powr = powr * 10;
        }


        return rv;
    }

    private static int anyBaseAddition(int n1, int n2, int b) {
        int rv = 0;
        int c = 0;
        int powr = 1;
        while (n1 > 0 || n2 > 0 || c > 0) {
            int f1 = n1 % 10;
            int f2 = n2 % 10;
            int sum = f1 + f2 + c;
            n1 = n1 / 10;
            n2 = n2 / 10;
            int d = sum % b;
            c = sum / b;
            rv += d * powr;
            powr = powr * 10;
        }
        return rv;
    }
}
