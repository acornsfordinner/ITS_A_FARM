package com.company;

import java.security.SecureRandom;
import java.util.Random;

public abstract class FarmAnimal {

    protected String name;
    protected String noise;

    FarmAnimal() {
        setName(name);
        setNoise(noise);

    }

    public FarmAnimal(String noise) {
        setName(name);
        this.noise = noise;
    }

    public FarmAnimal(String name, String noise) {
        this.name = name;
        this.noise = noise;
    }

    protected void setName(String name) {
        if (name == null)
            this.name = String.valueOf(new Random().nextInt(9999));
        else
            this.name = name;
    }

    protected String getName() {

        return this.name;
    }

    protected void setNoise(String noise) {
        if (noise == null)
            this.noise = "*GENERIC ANIMAL NOICE*";
        else
            this.noise = noise;
    }

    protected String getNoise() {
        return this.noise;
    }

    public String printNoise() {
        return noise;
    }

    public String toString() {
        System.out.println(noise);
        return name;
    }

    public String noise() {

        return noise;
    }

}
