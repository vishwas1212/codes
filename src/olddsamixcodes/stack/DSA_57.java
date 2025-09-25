package olddsamixcodes.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * @author Vishwas Stock Span
 *
 */
public class DSA_57 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = Integer.parseInt(br.readLine());
		}

		int[] span = solve(a);
		display(span);

	}

	private static void display(int[] span) {
		StringBuilder sb = new StringBuilder();
		for (int val : span) {
			System.out.println(val + "\n");
		}
		System.out.println(sb);

	}

	private static int[] solve(int[] arr) {
		int[] span = new int[arr.length];
		Stack<Integer> st = new Stack<>();
		st.push(0);
		span[0] = 1;

		System.out.println(st.peek());
		for (int i = 1; i < arr.length; i++) {
			while (st.size() > 0 && arr[i] > arr[st.peek()]) {

				st.pop();
			}

			if (st.size() == 0) {
				span[i] = i + 1;
			} else {
				span[i] = i - st.peek();
			}

			st.push(i);
		}

		return span;
	}

}
