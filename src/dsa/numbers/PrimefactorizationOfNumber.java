package dsa.numbers;

import java.util.Scanner;

public class PrimefactorizationOfNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int div = 2;
        while (num != 1) {
            if (num % div == 0) {
                num = num / div;
                System.out.print(div + "\t");
            } else {
                div++;
            }
        }
    }
}
