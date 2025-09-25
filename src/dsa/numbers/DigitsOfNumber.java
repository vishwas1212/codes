package dsa.numbers;

import java.util.Scanner;

public class DigitsOfNumber {
    public static void main(String[] args) {
        System.out.println("Enter the Number");
        Scanner scan = new Scanner(System.in);
        int dig = scan.nextInt();
        int temp = dig;
        int nod = 0;
        while (temp > 0) {
            temp = temp / 10;
            nod++;
        }
        int div = (int) Math.pow(10, nod - 1);
        while (div > 0) {
            int res = dig / div;
            System.out.println(res);
            dig = dig % div;
            div = div / 10;
        }
    }
}
