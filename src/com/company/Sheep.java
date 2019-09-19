package com.company;

public class Sheep extends FarmAnimal{

    public Sheep(){
        super("*BÄÄ*");
    }
    public Sheep(String name){
        super(name, "*BÄÄ*");
    }



    @Override
    public String toString() {
        return "A sheep called " + getName() +" sounding like " + getNoise();
    }
}
