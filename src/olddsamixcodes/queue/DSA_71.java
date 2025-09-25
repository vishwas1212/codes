package olddsamixcodes.queue;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author Vishwas Queue Functionality
 *
 */
public class DSA_71 {

	public static void main(String[] args) {

		Queue<Integer> que=new ArrayDeque<>();
		que.add(10);
		System.out.println(que);

		que.add(20);
		System.out.println(que);

		que.add(30);
		System.out.println(que);
		
		System.out.println(que.peek());
		System.out.println(que);
		
		System.out.println(que.remove());
		System.out.println(que.peek());
		System.out.println(que);

	}

}
