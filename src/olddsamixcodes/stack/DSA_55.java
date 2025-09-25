package olddsamixcodes.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * @author Vishwas To find the next greater element
 *
 */
public class DSA_55 {

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
		st.push(arr[arr.length - 1]);

		nge[arr.length - 1] = -1;

		for (int i = arr.length - 2; i >= 0; i--) {

			// -a+
			while (st.size() > 0 && arr[i] >= st.peek()) {

				st.pop();
			}

			if (st.size() == 0) {
				nge[i] = -1;
			} else {
				nge[i] = st.peek();
			}
			st.push(arr[i]);

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
