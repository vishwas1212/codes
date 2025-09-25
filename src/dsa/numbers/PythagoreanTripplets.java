package dsa.numbers;

import java.util.Scanner;

public class PythagoreanTripplets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();
        boolean isPythagoreanTripplet = false;
        if (n1 > n2 && n1 > n3) {
            isPythagoreanTripplet = n1 * n1 == n2 * n2 + n3 * n3;

        } else if (n2 > n1 && n2 > n3) {
            isPythagoreanTripplet = n2 * n2 == n1 * n1 + n3 * n3;
        } else {
            isPythagoreanTripplet = n3 * n3 == n2 * n2 + n1 * n1;
        }
        System.out.println(isPythagoreanTripplet);
    }
}
