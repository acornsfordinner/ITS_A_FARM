package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static byte animalsInBarn = 0;
    static protected FarmAnimal[] b1 = new FarmAnimal[3];
    static Barn[] ladugard;

    public static void main(String[] args) {
        runFarm();
    }

    public static void runFarm() {
        Scanner scan = new Scanner(System.in);
        byte choice = 0;

        System.out.println("WELCOME TO THE FARM. \nOur barn has room for 3 animals.\n");
        do {
            System.out.println("\nWhat operation do you want to perform? \n1. Add an animal." +
                    "\n2. Hear the noises from the barn. " +
                    "\n3. Quit.");
            try {
                choice = scan.nextByte();
                switch (choice) {
                    case 1:
                        addAnimal();
                        break;
                    case 2:
                        if (animalsInBarn == 0)
                            System.out.print("*EMPTY BARN SOUNDS*\n\n");
                        else if (animalsInBarn == 1) {
                            System.out.println("There is 1 animal in the barn: \n");
                        }
                        else {
                            System.out.println("There are "+animalsInBarn+" animals in the barn: \n");
                        }
                            for (int x = 0; x < animalsInBarn; x++) {
                                System.out.print(b1[x].toString() + "\n");
                            }
                        break;
                    case 3:
                        break;
                    default:

                }
            } catch (InputMismatchException e) {
                System.out.print("Invalid input. Try again.\n\n");
                scan.nextLine();
            }

        } while (choice != 3);
    }

    public static void addAnimal() {
        Scanner scan = new Scanner(System.in);
        boolean ok = false;
        do {
            if (animalsInBarn < b1.length) {
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
                                    b1[animalsInBarn] = new Cow(name);
                                    ok = true;
                                    animalsInBarn++;
                                } else {
                                    b1[animalsInBarn] = new Cow();
                                    System.out.print("\nFine. the cow is now called "+b1[animalsInBarn].getName()+"\n");
                                    ok = true;
                                    animalsInBarn++;
                                }
                            } catch (InputMismatchException e) {
                                System.out.print("Invalid name. You fucked up. No second chances.\n");
                                scan.nextLine();
                            }
                            break;
                        case 2:
                            System.out.print("Do you want to name the sheep?" +
                                    "\n1. Yes." +
                                    "\n2. No, i'm a horrible person " +
                                    "and i'm fine with calling a living being by a number.");
                            try {
                                tempname = scan.nextByte();
                                scan.nextLine();
                                if (tempname == 1) {
                                    System.out.print("Please input name: ");
                                    name = scan.nextLine();
                                    b1[animalsInBarn] = new Sheep(name);
                                    ok = true;
                                    animalsInBarn++;
                                } else {
                                    b1[animalsInBarn] = new Sheep();
                                    System.out.print("\nFine. the sheep is now called "+b1[animalsInBarn].getName()+"\n");
                                    ok = true;
                                    animalsInBarn++;
                                }
                            } catch (InputMismatchException e) {
                                System.out.print("Invalid name. You fucked up. No second chances.\n");
                                scan.nextLine();
                            }
                            break;
                        case 3:
                            System.out.print("Do you want to name the chicken?" +
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
                                    b1[animalsInBarn] = new Chicken(name);
                                    animalsInBarn++;
                                } else {
                                    System.out.print("You monster. \n");
                                    b1[animalsInBarn] = new Chicken();
                                    ok = true;
                                    System.out.print("\nFine. the sheep is now called "+b1[animalsInBarn].getName()+"\n");
                                    animalsInBarn++;
                                }
                            } catch (InputMismatchException e) {
                                System.out.print("Invalid name. You fucked up. No second chances.\n");
                                scan.nextLine();
                            }
                            break;
                    }

                } catch (InputMismatchException e) {
                    System.out.print("Invalid input. Try again.\n\n");
                    scan.nextLine();
                }
            } else {
                System.out.println("The barn is full! Time to listen to the cacaphony!");
                ok = true;
            }
        } while (!ok);
    }


}
