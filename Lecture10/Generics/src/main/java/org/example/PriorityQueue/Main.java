package org.example.PriorityQueue;

public class Main {
    static void main() {
        PriorityQueue<String> queue = new PriorityQueue<>();

        queue.enqueue("Peter with some knee pain", false);
        queue.enqueue("Alice in labor", true);
        queue.enqueue("John with a week cough", false);

        String next;
        for (int i =0; i<3; i++){
            next = queue.dequeue();
            System.out.println(next);
        }
    }
}
