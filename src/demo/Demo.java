package demo;

import java.util.Scanner;

public class Demo {

    static class Node {
        int data;
        Node next;

        public Node(int val, Node next) {
            this.data = val;
            this.next = next;
        }

        public Node() {
        }
    }

    static class LinkedList {
        Node head;
        Node tail;
        int size;

        void addLast(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = null;
            if (size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        void display() {
            for (Node temp = head; temp != null; temp = temp.next) {
                System.out.print(temp.data + " ");
            }
            System.out.println();
        }

        void reverse() {
            Node prev = null; // 10 20 30 40 // prev = null
            Node curr = head; // head = 10

            while (curr != null) {
                Node next = curr.next; // next = 20
                curr.next = prev; // 20 = prev
                prev = curr; // 20
                curr = next; // 30
            }
            Node temp = head;
            head = tail;
            tail = temp;
        }
    }

    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Demo.LinkedList list = new Demo.LinkedList();
        for (int i = 0; i < n; i++) {
            int val = scan.nextInt();
            list.addLast(val);
        }
        list.display();
        list.reverse();
        list.display();
    }
}
