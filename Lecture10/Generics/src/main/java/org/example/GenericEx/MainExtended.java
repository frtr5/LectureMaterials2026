package org.example.GenericEx;

import org.example.GenericEx.moduls.Carrot;
import org.example.GenericEx.moduls.Chicken;
import org.example.GenericEx.moduls.Ingredient;
import org.example.GenericEx.moduls.Vegetarian;

public class MainExtended {
    static void main() {
        FryingPan<Vegetarian> vegetarianFryingPan = new FryingPan<>();
        FryingPan<Ingredient> generalFryingPan = new FryingPan<>();

        vegetarianFryingPan.fry(new Carrot());
//        not allowed
//        vegetarianFryingPan.fry(new Chicken());

        generalFryingPan.fry(new Carrot());
        generalFryingPan.fry(new Chicken());

//      Can do, but this might not make sense
        FryingPan<String> stringFryingPan = new FryingPan<>();

//        Can only take ingredients so this wont work
//        FancyFryingPan<String> stringFancyFryingPan = new FancyFryingPan<String>();

        FancyFryingPan<Vegetarian> vegetarianFancyFryingPan = new FancyFryingPan<>();
        vegetarianFryingPan.fry(new Carrot());
        FancyFryingPan<Ingredient> generalFancyFryingPan = new FancyFryingPan<>();
        generalFancyFryingPan.fry(new Carrot());
        generalFancyFryingPan.fry(new Chicken());

    }
}
