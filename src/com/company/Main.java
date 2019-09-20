package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Barn barn1 = new Barn(barnSize());
    barn1.runFarm();
    }

    private static int barnSize(){
        System.out.println("Let's build you a barn! \nHow many animals do you want to fit in it? ");
        int barnSize = -1;
        do{
        try{
            barnSize = new Scanner(System.in).nextInt();
        }catch(InputMismatchException e){
            System.out.println("Invalid input");
        }}
        while(barnSize<1);
        return barnSize;
    }


}
