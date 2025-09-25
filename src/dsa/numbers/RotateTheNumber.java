package dsa.numbers;

import java.util.Scanner;

public class RotateTheNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int rot = scan.nextInt();
        int nod = 0, temp = num;

        while (temp > 0) {
            temp = temp / 10;
            nod++;
        }
        int div = (int) Math.pow(10, nod - 1);
        int rotatedNum = 0;
        if (rot < 0) {
            rot = nod + rot;
        }
        while (rot > 0) {
            int rem = num % 10;
            num = num / 10;
            rotatedNum = rem * div + num;
            num = rotatedNum;
            rot--;
        }
        System.out.println("Rotation of the number is: " + rotatedNum);
    }
}
