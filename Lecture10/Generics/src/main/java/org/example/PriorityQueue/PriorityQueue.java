package org.example.PriorityQueue;

import java.util.ArrayList;

public class PriorityQueue <T> {
    private ArrayList<T> normalQueue;
    private ArrayList<T> priorityQueue;

    public PriorityQueue(){
        normalQueue = new ArrayList<>();
        priorityQueue = new ArrayList<>();
    }

    void enqueue(T item, boolean priority){
        if (priority){
            priorityQueue.add(item);
        }else{
            normalQueue.add(item);
        }
    }

    T dequeue (){
        if (!priorityQueue.isEmpty()){
            return priorityQueue.removeFirst();
        } else{
            return normalQueue.removeFirst();
        }
    }
}
