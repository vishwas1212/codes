package olddsamixcodes.linkedlist;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DSA_74 {

	public static class Node {
		int data;
		Node next;
	}

	public static class LinkedList {

		Node head;
		Node tail;
		int size;

		int size() {
			return size;
		}

		void display() {
			Node temp = head; // passing the head data and the next node address
			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next; // assigning the next node
			}
			System.out.println();
		}

		void addFirst(int val) {
			Node temp = new Node();
			temp.data = val;
			temp.next = head;
			head = temp;

			if (size == 0) {
				tail = temp;
			}
			size++;
		}

		void addLast(int val) {
			Node temp = new Node();
			temp.data = val;
			temp.next = null;

			if (size == 0) {
				head = tail = temp; // when the list is empty then head and tail are at the same place
			} else {
				tail.next = temp; // last node of the list
				tail = temp;
			}
			size++;
		}

		void addAt(int idx, int val) {
			if (idx < 0 || idx > size) {
				System.out.println("Invalid Arguments");
			} else if (idx == 0) {
				addFirst(val);
			} else if (idx == size) {
				addLast(val);
			} else {
				Node node = new Node();
				node.data = val;
				Node temp = head;
				for (int i = 0; i < idx - 1; i++) {
					temp = temp.next;
				}
				node.next = temp.next;
				temp.next = node;
				size++;
			}
		}

		int getFirst() {

			if (size == 0) {
				System.out.println("Empty List!");
				return -1;
			} else {
				return head.data;
			}
		}

		int getLast() {
			if (size == 0) {
				System.out.println("Empty List!");
				return -1;
			} else {
				return tail.data;
			}
		}

		int getAt(int idx) {
			if (size == 0) {
				System.out.println("Empty List!");
				return -1;
			} else if (idx < 0 || idx >= size) {
				System.out.println("Invalid Arguement");
				return -1;
			} else {
				Node temp = head; // temp had the head information
				for (int i = 0; i < idx; i++) {
					temp = temp.next;
				}
				return temp.data;
			}
		}

		public int kThFromLast(int k) {
			Node slow = head;
			Node fast = head;

			for (int i = 0; i < k; i++) {
				fast = fast.next;
			}

			while (fast != tail) {
				slow = slow.next;
				fast = fast.next;
			}
			return slow.data;
		}

		public int mid() {
			Node slow = head;
			Node fast = head;
			while (fast.next != null && fast.next.next != null) {
				slow = slow.next;
				fast = fast.next.next;
			}
			return slow.data;

		}

		void removeFirst() {
			if (size == 0) {
				System.out.println("Empty List");
			} else if (size == 1) {
				head = tail = null; // if theres 1 obj then head tail will become null
				size = 0; // size will be zero after removing
			} else {
				head = head.next; // it will point to the next pointer
				size--; // after removing the size will decrease
			}
		}

		void removeLast() {
			if (size == 0) {
				System.out.println("Empty List!");
			} else if (size == 1) {
				head = tail = null;
				size = 0;
			} else {
				Node temp = head;
				for (int i = 0; i < size - 2; i++) {
					temp = temp.next;
				}
				tail = temp;
				temp.next = null;
				size--;
			}
		}

		void removeAt(int idx) {
			if (idx < 0 || idx >= size) {
				System.out.println("Invalid Arguement!");
			} else if (idx == 0) {
				removeFirst();
			} else if (idx == size - 1) {
				removeFirst();
			} else {
				Node temp = head;
				for (int i = 0; i < idx - 1; i++) {
					temp = temp.next;
				}
				temp.next = temp.next.next;
				size--;
			}
		}

		private Node getNode(int idx) {

			Node temp = head; // temp had the head information
			for (int i = 0; i < idx; i++) {
				temp = temp.next;
			}
			return temp;

		}

		void reverseDI() {
			int li = 0;
			int ri = size - 1;

			while (li < ri) {
				Node left = getNode(li);
				Node right = getNode(ri);

				int temp = left.data;
				left.data = right.data;
				right.data = temp;

				li++;
				ri--;

			}

		}

	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		LinkedList list = new LinkedList();
		
		
		
		String str = br.readLine();
		while (str.equals("quit") == false) {

			if (str.startsWith("addLast")) {
				int val = Integer.parseInt(str.split(" ")[1]);
				list.addLast(val);
			}

			else if (str.startsWith("addFirst")) {
				int val = Integer.parseInt(str.split(" ")[1]);
				list.addFirst(val);
			}

			else if (str.startsWith("addAt")) {
				int idx = Integer.parseInt(str.split(" ")[1]);
				int val = Integer.parseInt(str.split(" ")[2]);
				list.addAt(idx, val);
			}

			else if (str.startsWith("size")) {
				System.out.println(list.size);
			}

			else if (str.startsWith("display")) {
				list.display();
			}

			else if (str.startsWith("removeFirst")) {
				list.removeFirst();
			}

			else if (str.startsWith("getFirst")) {
				int val = list.getFirst();
				if (val != -1) {
					System.out.println(val);
				}
			}

			else if (str.startsWith("getLast")) {
				int val = list.getLast();
				if (val != -1) {
					System.out.println(val);
				}
			}

			else if (str.startsWith("getAt")) {
				int idx = Integer.parseInt(str.split(" ")[1]);
				int val = list.getAt(idx);
				if (val != -1) {
					System.out.println(val);
				}
			}

			else if (str.startsWith("kthFromEnd")) {
				int idx = Integer.parseInt(str.split(" ")[1]);
				System.out.println(list.kThFromLast(idx));
			}

			else if (str.startsWith("mid")) {
				System.out.println(list.mid());
			}

			else if (str.startsWith("removeLast")) {
				list.removeLast();
			}

			else if (str.startsWith("removeAt")) {
				int idx = Integer.parseInt(str.split(" ")[1]);
				list.removeAt(idx);
			}

			else if (str.startsWith("reverseDI")) {
				list.reverseDI();
			}

			str = br.readLine();

		}

	}

}
