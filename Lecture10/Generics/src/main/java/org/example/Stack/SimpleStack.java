package org.example.Stack;

import java.util.ArrayList;

public class SimpleStack <T> {

    private ArrayList<T> data;

    public SimpleStack() {
        data = new ArrayList<>();
    }

    public void push(T item) {
        data.add(item);
    }

    public T pop() {
        return data.removeLast();
    }

    public String checkStack(){
        return data.toString();
    }

}
