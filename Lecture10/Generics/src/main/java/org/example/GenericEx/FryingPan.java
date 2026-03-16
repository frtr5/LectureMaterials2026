package org.example.GenericEx;

public class FryingPan<T> {
    public T fry(T ing){
        System.out.println("Frying " + ing);
        System.out.println(ing + " is now hot");
        return ing;
    }
}
