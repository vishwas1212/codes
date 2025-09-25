package olddsamixcodes.demo;

import java.util.Arrays;
import java.util.PriorityQueue;

public class TwoDimensionalArray {

	public static void main(String[] args) {

		int[][] arr = { { 4, 9, 3 }, { 2, 7, 11 }, { 8, 17, 5 } };
		int x = 6;

		System.out.println(Arrays.deepToString(arr));

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				for (int k = 0; k < arr[i].length; k++) {
					if (arr[i][j] < arr[i][k]) {
						int temp = arr[i][j];
						arr[i][j] = arr[i][k];
						arr[i][k] = temp;
					}
				}
			}
		}

		System.out.println(Arrays.deepToString(arr));

		PriorityQueue pq = new PriorityQueue();
		if (x == 1)
			System.out.println(arr[0][0]);

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				pq.add(arr[i][j]);
		//		System.out.println(pq.size());
				System.out.println(pq.toString());
				if (pq.size() > x) {
					pq.poll();
				}
			}
		}
		System.out.println(pq.peek());

		int max = arr[0][0];
		int min = arr[0][0];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (max < arr[i][j]) {
					max = arr[i][j];
				}
				if (min > arr[i][j]) {
					min = arr[i][j];
				}
			}
		}

		System.out.println("Max is: " + max + " " + "Min is: " + min);
		

	}

}
