package dsa.bestpattern.fastandslowpointers.optimal;

public class HappyNumberOP {
    static void main() {
        int[] tests = {19, 2, 7, 4, 1, 116};
        for (int t : tests) {
            System.out.println("Floyd -> isHappy(" + t + "): " + isHappy(t));
        }
    }

    private static boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = getNext(slow);
            fast = getNext(getNext(fast));
        } while (slow != fast);
        return fast == 1;
    }

    private static int getNext(int n) {
        int sum = 0;
        while (n > 0) {
            int dig = n % 10;
            sum += dig * dig;
            n = n / 10;
        }
        return sum;
    }
}
