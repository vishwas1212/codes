package olddsamixcodes.demo;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.stream.Collectors;

public class SecondMax {

	public static void main(String[] args) {
		int[] arr = {30,20,40,30,50,60,50,60,50,60};
		int max = -1, secondMax = -1;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				secondMax = max;
				max = arr[i];
			}
			if (arr[i] > secondMax && max > arr[i]) {

				secondMax = arr[i];

			}
		}

		System.out.println("max: " + max + " " + "secondmax: " + secondMax);
		
		Set set= Arrays.stream(arr).boxed().collect(Collectors.toSet());

		PriorityQueue<Object> pq = new PriorityQueue<>();
		int target = 1;

		for (int i = 0; i < set.size(); i++) {
			pq.add(arr[i]);
			if (pq.size() > target) {
				pq.poll();
			}
		}

		System.out.println(pq.peek());
	}

}
