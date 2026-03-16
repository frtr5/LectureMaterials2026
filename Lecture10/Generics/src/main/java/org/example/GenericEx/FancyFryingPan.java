package org.example.GenericEx;

import org.example.GenericEx.moduls.Ingredient;

public class FancyFryingPan <T extends Ingredient>{
    public T fry(T ing){
        System.out.println("Frying " + ing.getName());
        ing.setTemp(100);
        System.out.println(ing.getName() + " is now hot at " + ing.getTemp() + " degrees");
        return ing;
    }
}
