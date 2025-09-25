package dsa.numbers;

import java.util.Scanner;

public class DigitsCount {


    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int nod = 0;
        while (num > 0) {
            int f = num / 10;
            num = f;
            nod++;
        }
        System.out.println("Nod is " + nod);
    }
}
