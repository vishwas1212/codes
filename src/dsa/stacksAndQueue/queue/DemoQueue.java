package dsa.stacksAndQueue.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class DemoQueue {
    public static void main(String[] args) {
        Queue queue = new ArrayDeque();
        queue.add(10);
        System.out.println(queue);
        System.out.println(queue.peek());
        queue.add(20);
        System.out.println(queue);
        System.out.println(queue.peek());
        queue.add(30);
        System.out.println(queue);
        System.out.println(queue.peek());
        queue.add(40);
        System.out.println(queue);
        System.out.println(queue.peek());
        queue.add(50);
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println("---------");
        System.out.println(queue.remove());
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue);
        System.out.println(queue.peek());
        queue.add(60);
        System.out.println(queue);
        System.out.println(queue.peek());
        queue.add(70);
        System.out.println(queue);
        System.out.println(queue.peek());

    }
}
