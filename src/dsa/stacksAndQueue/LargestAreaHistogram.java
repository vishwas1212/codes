package dsa.stacksAndQueue;

import java.util.Arrays;
import java.util.Stack;

public class LargestAreaHistogram {
    public static void main(String[] args) {
        int[] n = {8, 6, 2, 5, 4, 5, 1, 6};
        Stack<Integer> st = new Stack<>();
        int[] rb = new int[n.length]; // let's find the right boundary for the elements
        st.push(n.length - 1);
        rb[n.length - 1] = n.length;

        for (int i = n.length - 2; i >= 0; i--) {
            while (st.size() > 0 && n[i] < n[st.peek()]) {
                st.pop();
            }
            if (st.size() > 0) {
                rb[i] = st.peek();
            } else {
                rb[i] = n.length;
            }
            st.push(i);
        }

        int[] lb = new int[n.length]; // // let's find the left boundary for the elements
        st.push(0);
        lb[0] = -1;

        for (int i = 1; i < n.length; i++) {
            while (st.size() > 0 && n[i] < n[st.peek()]) {
                st.pop();
            }
            if (st.size() > 0) {
                lb[i] = st.peek();
            } else {
                lb[i] = -1;
            }
            st.push(i);
        }
        int maxArea = 0;
        for (int i = 0; i < n.length; i++) {
            int width = rb[i] - lb[i] - 1;
            int area = n[i] * width;
            if (area > maxArea) {
                maxArea = area;
            }
        }
        System.out.println(Arrays.toString(rb));
        System.out.println(Arrays.toString(lb));
        System.out.println("Max Area: " + maxArea);
    }
}
