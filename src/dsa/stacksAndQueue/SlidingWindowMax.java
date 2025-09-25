package dsa.stacksAndQueue;

import java.util.Arrays;
import java.util.Stack;

public class SlidingWindowMax {
    public static void main(String[] args) {
        int[] n = {2, 9, 3, 8, 1, 7, 12, 6, 14, 4, 32, 07, 19, 8, 12, 6};
        int k = 4;
        int[] nge = new int[n.length];
        Stack<Integer> st = new Stack<>();
        st.push(n.length - 1);
        nge[n.length - 1] = n.length;

        for (int i = n.length - 2; i >= 0; i--) {
            while (st.size() > 0 && n[i] >= n[st.peek()]) {
                st.pop();
            }
            if (st.size() > 0) {
                nge[i] = st.peek();
            } else {
                nge[i] = n.length;
            }
            st.push(i);
        }
        System.out.println(Arrays.toString(nge));

        int j = 0;
        for (int i = 0; i <= n.length - k; i++) {
            if (j < i) {
                j = i;
            }
            while (nge[j] < i + k) {
                j = nge[j];
            }
            System.out.print(n[j] + "\t");
        }
    }
}
