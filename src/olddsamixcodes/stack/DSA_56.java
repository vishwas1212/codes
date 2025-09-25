package olddsamixcodes.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * @author Vishwas To find the next greater element from left
 *
 */
public class DSA_56 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(br.readLine());
		}

		int[] nge = solve(a);
		display(nge);

	}

	private static int[] solve(int[] arr) {
		int[] nge = new int[arr.length];
		Stack<Integer> st = new Stack<>();
		st.push(0);

		for (int i = 1; i < arr.length; i++) {
			while (st.size() > 0 && arr[i] > arr[st.peek()]) {
				System.out.println(st.peek());
				int pos = st.peek();
				nge[pos] = arr[i];
				st.pop();
			}
			st.push(i);

			while (st.size() > 0) {
				int pos = st.peek();
				nge[pos] = -1;
				st.pop();
			}
		}

		return nge;
	}

	private static void display(int[] a) {
		StringBuilder sb = new StringBuilder();
		for (int val : a) {
			System.out.println(val + "\n");
		}
		System.out.println(sb);

	}

}
