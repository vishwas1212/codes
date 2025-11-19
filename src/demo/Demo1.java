package demo;

public class Demo1 {
    static void main() {
        int n = 10;
        int lastDig = n / 10;  //1
        while (n > 0) {
            int dig = n % 10;  //0
            if (dig > lastDig) {
                return;
            }
            lastDig = dig;
            n = n / 10;
        }
        System.out.println(lastDig);
    }
}
