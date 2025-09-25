package dsa.numbers;

import java.util.Scanner;

public class FibonacciNumbersTillN {
    public static void main(String[] args) {
        System.out.println("Enter the Number");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int fb1 = 0, fb2 = 1, sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print(fb1 + "\t");
            sum = fb1 + fb2;
            fb1 = fb2;
            fb2 = sum;
        }
    }
}
