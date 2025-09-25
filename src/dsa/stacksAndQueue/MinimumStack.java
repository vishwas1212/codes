package dsa.stacksAndQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinimumStack {
    public static class CustomStack {
        int data[];
        int tos;

        CustomStack(int cap) {
            data = new int[cap];
            tos = -1;
        }

        public void push(int val) {
            if (tos == data.length - 1) {
                System.out.println("Stack Overflow!");
            } else {
                tos++;
                data[tos] = val;
            }
        }

        public int pop() {
            if (tos == -1) {
                System.out.println("Stack Underflow!");
                return -1;
            } else {
                int val = data[tos];
                tos--;
                return val;
            }
        }

        public int top() {
            if (tos == -1) {
                System.out.println("Stack Underflow!");
                return -1;
            } else {
                return data[tos];
            }

        }

        public int size() {
            return tos + 1;
        }

        public void display() {
            for (int i = tos; i >= 0; i--) {
                System.out.print(data[i] + " ");
            }
            System.out.println();
        }

        public int min() {
            if (tos == -1) {
                System.out.println("Stack Underflow!");
                return -1;
            } else {
                int min = data[0];
                for (int i = 0; i < data.length; i++) {
                    if (data[i] < min) {
                        min = data[i];
                    }
                }
                return min;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        CustomStack st = new CustomStack(n);

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
            } else if (str.startsWith("display")) {
                st.display();
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
