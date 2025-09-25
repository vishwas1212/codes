package dsa.stacksAndQueue;

import java.util.Stack;

public class CelebrityProblem {
    public static void main(String[] args) {
        int[][] arr = {{0, 1, 1, 1, 1},
                {0, 0, 0, 1, 1},
                {1, 0, 0, 1, 0},
                {0, 0, 0, 0, 0},
                {0, 1, 0, 1, 0}};

        findCelibrity(arr);
    }

    private static void findCelibrity(int[][] arr) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            st.push(i);
        }

        while (st.size() >= 2) {
            int i = st.pop();
            int j = st.pop();
            if (arr[i][j] == 1) {
                st.push(j);
            } else {
                st.push(i);
            }
        }
        int pot = st.pop();

        for (int i = 0; i < arr.length; i++) {
            if (i != pot) {
                if (arr[i][pot] == 0 || arr[pot][i] == 1) {
                    System.out.print("none");
                    return;
                }
            }
        }
        System.out.println(pot);
    }
}
