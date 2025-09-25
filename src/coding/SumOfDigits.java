package coding;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Long num = scan.nextLong();
        int sum = 0;
        long finalSum = 0;
        while (num > 0) {
            long rem = num % 10;
            sum += rem;
            num = num / 10;

            finalSum = finalSum(sum);
            if (finalSum >= 10) {
                num = finalSum;
            }
        }

        System.out.println("Final Sum for Number " + finalSum);
    }

    private static int finalSum(int sum) {
        int res = 0;
        while (sum > 0) {
            int rem = sum % 10;
            res += rem;
            sum = sum / 10;

        }
        return res;
    }
}
