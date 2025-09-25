package dsa.numbers;

import java.util.Scanner;

public class InverseOfANumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int nod = 0, tempNum = num;

        while (tempNum > 0) {
            tempNum = tempNum / 10;
            nod++;
        }

        int pos = 1;
        int invertedNum = 0;

        while (nod > 0) {
            int div = num % 10;
            num = num / 10;
            int powr = (int) Math.pow(10, div - 1);
            invertedNum = invertedNum + pos * powr;
            pos++;
            nod--;
        }
        System.out.println("inversion of the number is: " + invertedNum);
    }
}
