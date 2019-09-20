package com.company;

import java.security.SecureRandom;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Barn {
    protected FarmAnimal[] barnAnimals; //implementation av aggregat//Barn innehåller av FarmAnimal
    private int animalsInBarn = 0;

    public Barn() {
        barnAnimals = new FarmAnimal[3];
    }

    public Barn(int size) {
        barnAnimals = new FarmAnimal[size];
    }


    //ALLT HÄNDER I LAGGÅRN


    public void runFarm() {

        Scanner scan = new Scanner(System.in);
        String choice = "0";

        System.out.println("\nWELCOME TO YOUR FARM. \n\nYour brand new barn has room for "+barnAnimals.length+" animals.\n");
        do {
            System.out.println("\nWhat operation do you want to perform? \n1. Add an animal." +
                    "\n2. Hear the noises from the barn. " +
                    "\n3. Quit.");

            choice = scan.nextLine();

            switch (choice) {
                case "1":
                    addAnimal();
                    break;
                case "2":
                    if (animalsInBarn == 0)
                        System.out.print("\n*EMPTY BARN SOUNDS*\n\n");
                    else if (animalsInBarn == 1) {
                        System.out.println("There is 1 animal in the barn: \n");
                    } else {
                        System.out.println("There are " + animalsInBarn + " animals in the barn: \n");
                    }
                    for (int x = 0; x < animalsInBarn; x++) {
                        System.out.print(barnAnimals[x].toString() + "\n");
                    }
                    break;
                case "3":
                    break;
                default:
                    System.out.print("Invalid input. Try again.\n\n");

            }
        } while (!choice.equals("3"));
    }

    public void addAnimal() {
        Scanner scan = new Scanner(System.in);
        boolean ok = false;
        do {
            if (animalsInBarn < barnAnimals.length) {
                byte temp;
                byte tempname;
                String name;
                try {
                    System.out.println("What animal do you want to add?" +
                            "\n\n1. A cow.\n2. A sheep.\n3. A chicken");

                    temp = scan.nextByte();
                    switch (temp) {
                        case 1:
                            System.out.println("Do you want to name the cow?" +
                                    "\n1. Yes." +
                                    "\n2. No, i'm a horrible person " +
                                    "and i'm fine with calling a living being by a number.");
                            try {
                                tempname = scan.nextByte();
                                scan.nextLine();
                                if (tempname == 1) {
                                    System.out.print("Please input name: ");
                                    name = scan.nextLine();
                                    barnAnimals[animalsInBarn] = new Cow(name);
                                    ok = true;
                                    animalsInBarn++;
                                } else {
                                    barnAnimals[animalsInBarn] = new Cow();
                                    System.out.print("\nFine. the cow is now called " + barnAnimals[animalsInBarn].getName() + "\n");
                                    ok = true;
                                    animalsInBarn++;
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Invalid name. You fucked up. No second chances.\n");
                                scan.nextLine();
                                ok = true;
                                animalsInBarn++;
                            }
                            break;
                        case 2:
                            System.out.println("Do you want to name the sheep?" +
                                    "\n1. Yes." +
                                    "\n2. No, i'm a horrible person " +
                                    "and i'm fine with calling a living being by a number.");
                            try {
                                tempname = scan.nextByte();
                                scan.nextLine();
                                if (tempname == 1) {
                                    System.out.print("Please input name: ");
                                    name = scan.nextLine();
                                    barnAnimals[animalsInBarn] = new Sheep(name);
                                    ok = true;
                                    animalsInBarn++;
                                } else {
                                    barnAnimals[animalsInBarn] = new Sheep();
                                    System.out.print("\nFine. the sheep is now called " + barnAnimals[animalsInBarn].getName() + "\n");
                                    ok = true;
                                    animalsInBarn++;
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Invalid name. You fucked up. No second chances.\n");
                                scan.nextLine();
                                ok = true;
                                animalsInBarn++;
                            }
                            break;
                        case 3:
                            System.out.println("Do you want to name the chicken?" +
                                    "\n1. Yes." +
                                    "\n2. No, i'm a horrible person " +
                                    "and i'm fine with calling a living being by a number.");
                            try {
                                tempname = scan.nextByte();
                                scan.nextLine();
                                if (tempname == 1) {
                                    System.out.print("Please input name: ");
                                    name = scan.nextLine();
                                    ok = true;
                                    barnAnimals[animalsInBarn] = new Chicken(name);
                                    animalsInBarn++;
                                } else {
                                    System.out.println("You monster. \n");
                                    barnAnimals[animalsInBarn] = new Chicken();
                                    ok = true;
                                    System.out.print("\nFine. the sheep is now called " + barnAnimals[animalsInBarn].getName() + "\n");
                                    animalsInBarn++;
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Invalid name. You fucked up. No second chances.\n");
                                scan.nextLine();
                                ok = true;
                                animalsInBarn++;
                            }
                            break;
                    }

                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Try again.\n\n");
                    scan.nextLine();
                }
            } else {
                System.out.println("The barn is full! Time to listen to the cacaphony!");
                ok = true;
            }
        } while (!ok);
    }


}