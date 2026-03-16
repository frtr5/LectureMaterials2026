package org.example.GenericEx;

public class MainSimple {
    static void main() {
        FryingPan<String> pan = new FryingPan<>();
        String hotIng =  pan.fry("Carrot");
    }
}
