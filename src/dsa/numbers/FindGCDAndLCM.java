package dsa.numbers;

import java.util.Scanner;

public class FindGCDAndLCM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int temp1 = n1, temp2 = n2;
        int lcm = 0, gcd = 0;
        int mod = 0;
        while (temp1 != 0) {
            mod = (temp1 > temp2) ? (temp1 % temp2) : (temp2 % temp1);
            if (mod == 0) {
                gcd = temp2;
                break;
            } else {
                temp1 = temp2;
                temp2 = mod;
            }

        }
        lcm = n1 * n2 / gcd;
        System.out.println("GCD for given no is: " + gcd + " And LCM is: " + lcm);
    }
}
