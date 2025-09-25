package dsa.stacksAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class NGTTRPC {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        int nge[] = solve(arr);
        display(nge);
    }

    private static void display(int[] nge) {
        for (int val : nge) {
            System.out.print(val + "\t");
        }
    }

    private static int[] solve(int[] arr) {
        int nge[] = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for (int i = 1; i < arr.length; i++) {
            while (st.size() > 0 && arr[i] > arr[st.peek()]) {
                int pos = st.peek();
                nge[pos] = arr[i];
                st.pop();
            }
            st.push(i);
        }
        while (st.size() > 0) {
            int pos = st.peek();
            nge[pos] = -1;
            st.pop();
        }
        return nge;
    }
}
