package dsa.numbers;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();


        for (int i = 0; i < n; i++) {
            int t = scan.nextInt();
            int count = 0;
            for (int div = 2; div * div < t; div++) {

                if (t % div == 0)
                    count++;
                break;
            }
            if (count == 0)
                System.out.println(t+" is Prime");
            else
                System.out.println(t+" is Not Prime");
        }
    }
}
