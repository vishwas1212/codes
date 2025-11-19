package dsa.bestpattern.fastandslowpointers.test;

import java.util.HashSet;

public class Test {
    static class Node {
        Node next;
        int data;
    }

    static class LinkedList {
        Node head;
        Node tail;
        int size;

        public void addLast(int val) {
            Node node = new Node();
            node.data = val;
            node.next = null;
            if (size == 0) {
                head = tail = node;
            } else {
                tail.next = node;
                tail = node;
            }
            size++;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder("[");
            Node current = head;
            while (current != null) {
                sb.append(current.data);
                if (current.next != null) sb.append(", ");
                current = current.next;
            }
            sb.append("]");
            return sb.toString();
        }

        public void createCycle(int idx) {
            if (idx < 0 || idx >= size) {
                throw new IllegalArgumentException("Index is invalid!");
            }

            Node target = head;
            for (int i = 0; i < idx; i++) {
                target = target.next;
            }
            tail.next = target;
        }

        public boolean hasCycleBF() {
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

        public boolean hasCycleOP() {
            Node slow = head;
            Node fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;

                if (slow == fast) {
                    return true;
                }
            }
            return false;
        }

        public int middleNodeBF() {
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
            return current.data;
        }

        public int middleNodeOP() {
            Node slow = head;
            Node fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow.data;
        }

        public boolean isHappyOP(int n) {
            int slow = n;
            int fast = getNext(n);

            while (fast != 1 && slow != fast) {
                slow = getNext(slow);
                fast = getNext(getNext(fast));
            }
            return fast == 1;
        }

        private int getNext(int n) {
            int sum = 0;
            while (n > 0) {
                int dig = n % 10;
                sum += dig * dig;
                n = n / 10;
            }
            return sum;
        }

        public boolean isHappyBF(int n) {
            HashSet<Integer> visited = new HashSet<>();
            int current = n;
            while (current != 1 && !visited.contains(current)) {
                visited.add(current);
                current = getNext(current);
            }
            return current == 1;
        }
    }

    static void main() {
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.addLast(50);
        list.addLast(50);
        System.out.println(list);

//        list.createCycle(2);
        System.out.println(list.hasCycleBF());
        System.out.println(list.hasCycleOP());
        System.out.println(list.middleNodeBF());
        System.out.println(list.middleNodeOP());
        System.out.println(list.isHappyBF(19));
        System.out.println(list.isHappyOP(4));
    }
}
