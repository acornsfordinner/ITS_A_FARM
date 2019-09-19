package com.company;

import java.security.SecureRandom;

public class Barn {
    private FarmAnimal[] barn;

    public Barn(){
        barn = new FarmAnimal[5];
    }

    public Barn(int size){
        barn = new FarmAnimal[size];
    }




    private int size;
    private String randomName;


    public void setSize(int size){
        this.size=size;
    }
    public int getSize(){
        return this.size;
    }
    public void setRandomName(String randomName){

        SecureRandom secRand = new SecureRandom();
        this.randomName = String.valueOf(1+ secRand.nextInt(9999));
    }

protected String getRandomName(){
    return randomName;
}

}