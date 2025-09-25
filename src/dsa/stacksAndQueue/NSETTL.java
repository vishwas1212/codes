package dsa.stacksAndQueue;

import java.util.Arrays;
import java.util.Stack;

public class NSETTL {
    public static void main(String[] args) {
        int[] n = {2, 5, 9, 1, 3, 12, 8, 6, 7};
        int[] res = new int[n.length];
        Stack<Integer> stack = new Stack<>();
        res[0] = -1;
        stack.push(n[0]);
        for (int i = 1; i < n.length; i++) {
            while (stack.size() > 0 && n[i] < stack.peek()) {
                stack.pop();
            }
            if (stack.size() > 0) {
                res[i] = stack.peek();
            } else {
                res[i] = -1;
            }
            stack.push(n[i]);
        }
        System.out.println(Arrays.toString(res));
    }
}
