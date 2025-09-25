package dsa.numbers;

import java.util.Scanner;

public class AnyBaseMultiplyPC {
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
        int pow = 1;
        while (n2 > 0) {
            int d2 = n2 % 10;
            n2 = n2 / 10;
            int sqrd = getFistPlaceMultiply(n1, b, d2);
            rv = getAnyBaseSum(sqrd * pow, rv, b);
            pow = pow * 10;
        }
        return rv;
    }

    private static int getAnyBaseSum(int n1, int n2, int b) {
        int rv = 0;
        int c = 0;
        int pow = 1;
        while (n1 > 0 || n2 > 0 || c > 0) {
            int d1 = n1 % 10;
            n1 = n1 / 10;
            int d2 = n2 % 10;
            n2 = n2 / 10;
            int d = d1 + d2 + c;
            c = d / b;
            d = d % b;
            rv += d * pow;
            pow = pow * 10;
        }
        return rv;
    }

    private static int getFistPlaceMultiply(int n1, int b, int d2) {

        int rv = 0;
        int c = 0;
        int d = 0;
        int pow = 1;
        while (n1 > 0 || c > 0) {
            int d1 = n1 % 10;
            n1 = n1 / 10;
            d = d1 * d2 + c;
            c = d / b;
            d = d % b;
            rv += d * pow;
            pow = pow * 10;
        }
        return rv;
    }
}