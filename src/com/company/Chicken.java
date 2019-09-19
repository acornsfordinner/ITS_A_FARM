package com.company;

public class Chicken extends FarmAnimal{
    public Chicken() {
        super("*chicken noises*");
    }

    public Chicken(String name){
        super(name, "*chicken noises*");
    }


    @Override
    public String toString() {
        return "A chicken " +
                "named " + getName() +
                ", sounding like " + getNoise();
    }

}
