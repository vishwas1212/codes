package olddsamixcodes.linkedlist;

import olddsamixcodes.linkedlist.DSA_74.LinkedList;

/**
 * @author Vishwas Merge Two sorted Linked List
 *
 */
public class DSA_77 {

	public static class Node {
		int data;
		int next;
	}

	public static LinkedList mergeTwoSortedList(LinkedList l1, LinkedList l2) {
		olddsamixcodes.linkedlist.DSA_74.Node one = l1.head;
		olddsamixcodes.linkedlist.DSA_74.Node two = l2.head;

		LinkedList res = new LinkedList();
		while (one != null && two != null) {

			if (one.data < two.data) {

				res.addLast(one.data);
				one = one.next;
			} else {
				res.addLast(two.data);
				two = two.next;
			}

		}
		while (one != null) {
			res.addLast(one.data);
			one = one.next;
		}

		while (two != null) {
			res.addLast(two.data);
			two = two.next;
		}

		return res;

	}

	public static void main(String[] args) {

		LinkedList l1 = new LinkedList();
		l1.addFirst(10);
		l1.addFirst(20);
		l1.addFirst(30);
		l1.addFirst(40);
		l1.addFirst(50);

		LinkedList l2 = new LinkedList();
		l2.addFirst(1);
		l2.addFirst(2);
		l2.addFirst(7);
		l2.addFirst(8);
		l2.addFirst(9);
		l2.addFirst(10);
		l2.addFirst(11);
		l2.addFirst(12);
		l2.addFirst(22);
		l2.addFirst(32);
		l2.addFirst(52);

		System.out.println(l2.toString());
		
		LinkedList l3 = mergeTwoSortedList(l1, l2);
		System.out.println(l3);

	}

}
