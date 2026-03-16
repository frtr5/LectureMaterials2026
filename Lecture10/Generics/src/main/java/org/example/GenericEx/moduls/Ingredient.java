package org.example.GenericEx.moduls;

public abstract class Ingredient {
    private int temp = 0;
    public abstract String getName();

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }
}
