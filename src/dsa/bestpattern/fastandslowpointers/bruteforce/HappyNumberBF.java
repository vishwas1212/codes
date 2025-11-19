package dsa.bestpattern.fastandslowpointers.bruteforce;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HappyNumberBF {
    static void main() {
        int[] tests = {19, 2, 7, 4, 1, 116};
        for (int t : tests) {
            System.out.println("isHappy(" + t + ") = " + isHappy(t) +
                    " | seq: " + happySequence(t, 20));
        }
    }

    private static List<Integer> happySequence(int n, int maxSteps) {
        HashSet<Integer> seen = new HashSet<>();
        List<Integer> seq = new ArrayList<>();
        int current = n;
        int steps = 0;

        while (current != 1 && !seen.contains(current) && steps < maxSteps) {
            seq.add(current);
            seen.add(current);
            current = sumOfSquares(current);
            steps++;
        }
        seq.add(current);
        return seq;
    }

    private static boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();
        int current = n;
        while (current != 1 && !seen.contains(current)) {
            seen.add(current);
            current = sumOfSquares(current);
        }
        return current == 1;
    }

    private static int sumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int dig = n % 10;
            sum += dig * dig;
            n = n / 10;
        }
        return sum;
    }
}
