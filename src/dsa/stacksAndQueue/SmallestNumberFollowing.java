package dsa.stacksAndQueue;

import java.util.Stack;

public class SmallestNumberFollowing {
    public static void main(String[] args) {
        String exp = "ddiddidd";
        int num = 1;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (ch == 'd') {
                st.push(num);
                num++;
            } else {
                st.push(num);
                num++;
                while (st.size() > 0) {
                    System.out.print(st.pop() + "\t");
                }
            }
        }

        st.push(num);
        while (st.size() > 0) {
            System.out.print(st.pop() + "\t");
        }
    }
}
