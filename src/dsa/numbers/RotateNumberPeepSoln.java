package dsa.numbers;

import java.util.Scanner;

public class RotateNumberPeepSoln {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int rot = scan.nextInt();

        int temp = num, nod = 0;

        while (temp > 0) {
            temp = temp / 10;
            nod++;
        }
        if (rot < 0) {
            rot = nod + rot;
        }
        int div = 1, mul = 1;
        for (int i = 1; i <= nod; i++) {
            if (i <= rot) {
                div = div * 10;
            } else {
                mul = mul * 10;
            }
        }

        int q = num / div;
        System.out.println(q);
        int r = num % div;
        System.out.println(r);

        int rotatedNum = r * mul + q;
        System.out.println(rotatedNum);
    }
}
