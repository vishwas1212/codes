package dsa.numbers;

import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int d = scan.nextInt();
        int dfreq = findDigitFrequency(n, d);
        System.out.println(dfreq);
    }

    private static int findDigitFrequency(int n, int d) {
        int rv = 0;
        while (n > 0) {
            int f = n % 10;
            if (f == d) {
                rv++;
            }
            n = n / 10;
        }
        return rv;
    }
}
