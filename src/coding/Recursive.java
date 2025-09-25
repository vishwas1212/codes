package coding;

public class Recursive {
    public static void main(String[] args) {
        int n = 1234;
        checkMethods(n);
    }

    private static void checkMethods(int n) {
        System.out.print(n % 10);
        if (n % 10 != 0) {
            checkMethods(n / 10);
        }
        System.out.print(n % 10);
    }
}
