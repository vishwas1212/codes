package dsa.linkedlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static class Node {
        Node next;
        int data;
    }

    public static class LinkedList {
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

        public void addFirst(int val) {

            Node node = new Node();
            node.data = val;
            node.next = head;
            head = node;
            if (size == 0) {
                tail = node;
            }
            size++;
        }

        public void addAt(int idx, int val) {
            if (idx == 0) {
                Node node = new Node();
                node.data = val;
                node.next = head;
                head = node;
                size++;
            } else if (idx == size - 1) {
                Node node = new Node();
                node.next = null;
                node.data = val;
                tail.next = node;
                tail = node;
                size++;
            } else {
                Node temp = new Node();
                temp.data = val;
                Node atIndex = head;
                Node prevIndex = head;
                for (int i = 0; i < idx; i++) {
                    atIndex = atIndex.next;
                }
                for (int i = 0; i < idx - 1; i++) {
                    prevIndex = prevIndex.next;
                }
                temp.next = atIndex;
                prevIndex.next = temp;
                size++;
            }
        }

        public int size() {
            return size;
        }

        public void display() {
            if (size > 0) {
                Node node = head;
                while (node != null) {
                    System.out.print(node.data + " ");
                    node = node.next;
                }
                System.out.println();
            } else {
                System.out.println("List is emplty!");
            }
        }

        public void removeFirst() {
            if (size == 0) {
                System.out.println("List is emplty!");
                return;
            } else if (size == 1) {
                head = tail = null;
                size--;
            } else {
                head = head.next;
                size--;
            }
        }

        public void removeLast() {
            if (size == 0) {
                System.out.println("List is empty!");
            } else if (size == 1) {
                head = tail = null;
                size--;
            } else {
                Node temp = head;
                for (int i = 0; i < size - 2; i++) {
                    temp = temp.next;
                }
                temp.next = null;
                tail = temp;
                size--;
            }
        }

        public void removeAt(int idx) {
            if (size == 0) {
                System.out.println("List is Empty!");
            } else if (size == 1) {
                head = tail = null;
                size--;
            } else if (idx == 0) {
                removeFirst();
            } else if (idx == size - 1) {
                removeLast();
            } else {
                Node afterIndex = head;
                Node beforeIndex = head;
                for (int i = 0; i < idx + 1; i++) {
                    afterIndex = afterIndex.next;
                }
                for (int i = 0; i < idx - 1; i++) {
                    beforeIndex = beforeIndex.next;
                }
                beforeIndex.next = afterIndex;
                size--;
            }
        }

        public int getFirst() {
            if (size == 0) {
                System.out.println("List is empty!");
                return -1;
            } else {
                return head.data;
            }
        }

        public int getLast() {
            if (size == 0) {
                System.out.println("List is empty!");
                return -1;
            } else {
                return tail.data;
            }
        }

        public int getAt(int idx) {
            if (size == 0) {
                System.out.println("List is empty!");
                return -1;
            } else if (idx < 0 || idx >= size) {
                System.out.println("Invalid Index!");
                return -1;
            } else {
                Node temp = head;
                for (int i = 0; i < idx; i++) {
                    temp = temp.next;
                }
                return temp.data;
            }
        }

        public void reverseDI() {
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

        private Node getNode(int idx) {
            Node temp = head;
            for (int i = 0; i < idx; i++) {
                temp = temp.next;
            }
            return temp;
        }

        public void reversePI() {
            Node prev = null;
            Node curr = head;
            while (curr != null) {
                Node next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            Node temp = head;
            head = tail;
            tail = temp;
        }

        public int kthFromLast(int k) {

            Node fast = head;
            Node slow = head;

            for (int i = 0; i < k; i++) {
                fast = fast.next;
            }

            while (fast != tail) {
                slow = slow.next;
                fast = fast.next;
            }
            return slow.data;
        }

        public int midOfLinkedList() {

            Node slow = head;
            Node fast = head;

            while (fast != null && fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow.data;
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
    }

    public static void testList(LinkedList list) {
        for (Node temp = list.head; temp != null; temp = temp.next) {
            System.out.print(temp.data + " ");
        }
        System.out.println();
        System.out.println(list.size);

        if (list.size > 0) {
            System.out.println(list.head.data);
        }
        if (list.size > 0) {
            System.out.println(list.tail.data);
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList list = new LinkedList();

        String str = br.readLine();
        while (str.equals("quit") == false) {
            if (str.startsWith("addLast")) {
                int val = Integer.parseInt(str.split(" ")[1]);
                list.addLast(val);
            } else if (str.startsWith("size")) {
                System.out.println(list.size());
            } else if (str.startsWith("display")) {
                list.display();
            } else if (str.startsWith("removeFirst")) {
                list.removeFirst();
            } else if (str.startsWith("getFirst")) {
                int val = list.getFirst();
                if (val != -1)
                    System.out.println(list.getFirst());
            } else if (str.startsWith("getLast")) {
                int val = list.getLast();
                if (val != -1)
                    System.out.println(list.getLast());
            } else if (str.startsWith("getAt")) {
                int idx = Integer.parseInt(str.split(" ")[1]);
                int val = list.getAt(idx);
                if (val != -1)
                    System.out.println(list.getAt(idx));
            } else if (str.startsWith("addFirst")) {
                int val = Integer.parseInt(str.split(" ")[1]);
                list.addFirst(val);
            } else if (str.startsWith("addAt")) {
                int idx = Integer.parseInt(str.split(" ")[1]);
                int val = Integer.parseInt(str.split(" ")[2]);
                list.addAt(idx, val);
            } else if (str.startsWith("removeLast")) {
                list.removeLast();
            } else if (str.startsWith("removeAt")) {
                int idx = Integer.parseInt(str.split(" ")[1]);
                list.removeAt(idx);
            } else if (str.startsWith("reverseDI")) {
                list.reverseDI();
            } else if (str.startsWith("reversePI")) {
                list.reversePI();
            } else if (str.startsWith("kthFromEnd")) {
                int idx = Integer.parseInt(str.split(" ")[1]);
                System.out.println(list.kthFromLast(idx));
            } else if (str.startsWith("midOfLinkedList")) {
                int res = list.midOfLinkedList();
                System.out.println(res);
            } else if (str.startsWith("hasCycle")) {
                boolean res = list.hasCycle();
                System.out.println(res);
            }
            str = br.readLine();
        }
    }
}
