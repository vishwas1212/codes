package dsa.bestpattern.fastandslowpointers.bruteforce;

import java.util.HashSet;

public class FastAndSlowPointersBF {
    static class Node {
        Node next;
        int data;
    }

    static class LinkedList {
        Node head;
        Node tail;
        int size;

        public void addLast(int val) {
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

        public void createCycle(int idx) {
            if (idx < 0 || idx >= size) {
                throw new IllegalArgumentException("Invalid Index!");
            }
            Node target = head;
            for (int i = 0; i < idx; i++) {
                target = target.next;
            }
            tail.next = target;
        }

        public boolean hasCycle() {
            HashSet<Node> visited = new HashSet<>();
            Node current = head;

            while (current != null) {
                if (visited.contains(current)) {
                    return true;
                }
                visited.add(current);
                current = current.next;
            }
            return false;
        }

        public void middleNode() {
            int count = 0;
            Node current = head;

            while (current != null) {
                count++;
                current = current.next;
            }
            current = head;
            for (int i = 0; i < count / 2; i++) {
                current = current.next;
            }
            System.out.println(current.data);
        }
    }

    static void main() {
        LinkedList list = new LinkedList();
        list.addLast(1);
        list.addLast(3);
        list.addLast(5);
        list.addLast(7);
        list.addLast(9);

        list.middleNode();
        list.createCycle(2);
        System.out.println(list.hasCycle());
    }
}
