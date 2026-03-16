package org.example.Queue;

import java.util.ArrayList;

public class SimpleQueue <T>{

    private ArrayList<T> data;

    public SimpleQueue() {
        data = new ArrayList<>();
    }

    public void enqueue(T item) {
        data.add(item);
    }

    public T dequeue() {
        return data.removeFirst();
    }

    public String checkQueue(){
        return data.toString();
    }
}
