package org.example.Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    static void main() {
        SimpleQueue<String> queue = new SimpleQueue<>();
        queue.enqueue("John");
        queue.enqueue("Bob");
        queue.enqueue("Alice");
        System.out.println(queue.checkQueue());
        String next = queue.dequeue();
        System.out.println(next + " left the queue");
        System.out.println(queue.checkQueue());

        Queue<String> realQueue = new ArrayDeque<>();
        realQueue.add("John");
        realQueue.add("Bob");
        realQueue.add("Alice");
        System.out.println(realQueue);
        next = realQueue.remove();
        System.out.println(next + " left the queue");
        System.out.println(queue.checkQueue());
    }
}
