package dsa.stacksAndQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class MinimumStackPC {
    public static class CustomStack {
        Stack<Integer> allData;
        Stack<Integer> minData;

        CustomStack() {
            allData = new Stack<>();
            minData = new Stack<>();
        }

        public void push(int val) {
            allData.push(val);

            if (minData.isEmpty() || minData.peek() >= val) {
                minData.push(val);
            }
        }

        public int pop() {
            if (allData.size() == 0) {
                System.out.println("Stack UnderFlow!");
                return -1;
            } else {
                Integer val = allData.pop();
                if (val == minData.peek()) {
                    minData.pop();
                }
                return val;
            }
        }

        public int top() {
            if (allData.isEmpty()) {
                System.out.println("Stack is Empty!");
                return -1;
            }
            else
            return allData.peek();
        }

        public int size() {
            return allData.size();
        }

        public int min() {
            if (minData.isEmpty()) {
                System.out.println("Stack is Empty!");
                return -1;
            }
            else
            return minData.peek();
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        CustomStack st = new CustomStack();

        String str = br.readLine();
        while (str.equals("quit") == false) {
            if (str.startsWith("push")) {
                int val = Integer.parseInt(str.split(" ")[1]);
                st.push(val);
            } else if (str.startsWith("pop")) {
                int val = st.pop();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("top")) {
                int val = st.top();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("size")) {
                System.out.println(st.size());
            } else if (str.startsWith("min")) {
                int val = st.min();
                if (val != -1) {
                    System.out.println(val);
                }
            }
            str = br.readLine();
        }
    }
}
