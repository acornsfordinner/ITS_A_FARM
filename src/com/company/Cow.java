package com.company;

public class Cow extends FarmAnimal{
    public Cow(){
        super("*MUUUU*");

    }
    public Cow(String name){
        super(name, "*MUUUU*");
    }





    @Override
    public String toString(){
        return "A cow called " + getName() +" sounding like " + getNoise();
    }
}
