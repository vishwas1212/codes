package dsa.stacksAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class NSETTR {
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
        for (int val : nge)
            System.out.print(val + "\t");
    }

    private static int[] solve(int[] arr) {
        int nge[] = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(arr[arr.length - 1]);
        nge[arr.length - 1] = -1;

        for (int i = arr.length - 2; i >= 0; i--) {

            while (st.size() > 0 && arr[i] <= st.peek()) {
                st.pop();
            }
            if (st.size() == 0) {
                nge[i] = -1;
            } else {
                nge[i] = st.peek();
            }
            st.push(arr[i]);
            System.out.println(st);

        }
        return nge;
    }
}
