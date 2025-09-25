package coding;

import java.util.Scanner;

public class NumbersInRowColumn {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int val = 65;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((char) val + "\t");
                val++;
            }
            System.out.println();
        }
    }
}
