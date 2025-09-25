package dsa.stacksAndQueue;

import java.util.Arrays;
import java.util.Stack;

public class NSETR {
    public static void main(String[] args) {
        int[] n = {2, 5, 9, 1, 3, 12, 8, 6, 7};
        int[] res = new int[n.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(n[n.length - 1]);
        res[n.length - 1] = -1;

        for (int i = n.length - 2; i >= 0; i--) {
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
