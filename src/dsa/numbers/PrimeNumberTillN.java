package dsa.numbers;

import java.util.Scanner;

public class PrimeNumberTillN {
    public static void main(String[] args) {
        System.out.println("Enter the low & high range");
        Scanner scan = new Scanner(System.in);
        int low = scan.nextInt();
        int high = scan.nextInt();

        for (int i = low; i <= high; i++) {
            int count = 0;
            for (int div = 2; div * div <= i; div++) {

                if (i % div == 0)
                    count++;
                break;
            }
            if (count == 0)
                System.out.println(i + " is Prime");
            else
                System.out.println(i + " is not Prime");
        }
    }
}
