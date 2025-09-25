package olddsamixcodes.demo;

import java.util.Collections;
import java.util.PriorityQueue;

public class SeconndMIn {

	public static void main(String[] args) {
		int[] arr = { 8, 10, 2, 3, 9, 9, 11, 12, 15, 19, 1 };

		int min = arr[0], secondMin = arr[0], thirdMin = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				thirdMin = secondMin;
				secondMin = min;
				min = arr[i];
			}
			if (arr[i] < secondMin && min < arr[i]) {
				thirdMin = secondMin;
				secondMin = arr[i];
			}
			if (arr[i] < thirdMin && secondMin > arr[i] && min < arr[i]) {

				thirdMin = arr[i];
			}
		}
		System.out.println("min: " + min + " " + "secondmin: " + secondMin + " " + "thirdmin: " + thirdMin);

		PriorityQueue pq = new PriorityQueue<>(Collections.reverseOrder());
		int target = 2;

		for (int i = 0; i < arr.length; i++) {
			pq.add(arr[i]);
			if (pq.size() > target) {
				pq.poll();
			}
		}
		
		System.out.println(pq.peek());

	}

}
