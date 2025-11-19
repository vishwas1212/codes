package dsa.bestpattern.fastandslowpointers.optimal;

public class FasfAndSlowPointersOP {
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
                throw new IllegalArgumentException("Invlaid Index!");
            }
            Node target = head;
            for (int i = 0; i < idx; i++) {
                target = target.next;
            }
            tail.next = target;
        }

        public boolean hasCycle() {
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

        public void midlleNode() {
            Node slow = head;
            Node fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            System.out.println(slow.data);
        }
    }

    static void main() {
        LinkedList list = new LinkedList();
        list.addLast(1);
        list.addLast(3);
        list.addLast(7);
        list.addLast(5);
        list.addLast(9);
        list.addLast(11);
        list.addLast(13);
        list.addLast(15);
        list.addLast(17);
        list.addLast(17);

        list.midlleNode();
        list.createCycle(2);
        System.out.println(list.hasCycle());
    }
}
