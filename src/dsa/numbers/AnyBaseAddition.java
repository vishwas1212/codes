package dsa.numbers;

import java.util.Scanner;

public class AnyBaseAddition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int b = scan.nextInt();
        int soln = anyBaseAddition(n1, n2, b);
        System.out.println(soln);
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
