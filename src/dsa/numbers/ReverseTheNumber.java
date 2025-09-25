package dsa.numbers;

import java.util.Scanner;

public class ReverseTheNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scan = new Scanner(System.in);
        int dig = scan.nextInt();
        int tempDig = dig;
        int nod = 0;
        while (tempDig > 0) {
            tempDig = tempDig / 10;
            nod++;
        }
        int div = (int) Math.pow(10, nod - 1);
        int tempDiv = div;
        int revNum = 0;
        int powr = 1;
        System.out.println(tempDiv);
        while (tempDiv != 0) {
            int f = dig / tempDiv;
            dig = dig % tempDiv;
            revNum = revNum + f * (int) Math.pow(10, powr - 1);
            tempDiv = tempDiv / 10;
            powr++;
        }
        System.out.println("Reversed Number is " + revNum);
    }
}
