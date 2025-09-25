package demo;

public class Demo {
    static void main() {
        int n = 56745674;
        int sum = 0;
        while (n > 0 || sum > 9) {
            if (n == 0) {
                n = sum;
                sum = 0;
            }
            int r = n % 10;
            sum = sum + r;
            n = n / 10;
        }
        System.out.println(sum);
    }
}
