package dsa.numbers;

import java.util.Scanner;

public class AnyBaseToAnyBase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int b1 = scan.nextInt();
        int b2 = scan.nextInt();
        int decvalue = getValueInDecimal(n, b1);
        int soln = FindBase(decvalue, b2);
        System.out.println(soln);
    }

    private static int FindBase(int decvalue, int b2) {
        int rv = 0;
        int pow = 1;
        while (decvalue > 0) {
            int f = decvalue % b2;
            decvalue = decvalue / b2;
            rv = rv + f * pow;
            pow = pow * 10;
        }
        return rv;
    }


    private static int getValueInDecimal(int n, int b1) {
        int rv = 0;
        int pow = 1;
        while (n > 0) {
            int f = n % 10;
            n = n / 10;
            rv = rv + f * pow;
            pow = pow * b1;
        }
        return rv;
    }
}
