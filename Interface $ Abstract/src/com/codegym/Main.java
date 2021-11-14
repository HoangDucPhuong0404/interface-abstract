package com.codegym;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Bolt bolt = new Bolt("Bolt 1");
        bolt.run();
        bolt.bark();
        System.out.println();

        AngryBirds angryBird = new AngryBirds("AngryBird 1");
        angryBird.fly();
        System.out.println();

        Nemo nemo = new Nemo("Nemo 1");
        nemo.swim();
        System.out.println();

        McQueens mcQueen = new McQueens("McQueen 1");
        mcQueen.run();
        System.out.println();

        Siddeley siddeley = new Siddeley("Siddeley 1");
        siddeley.fly();
        System.out.println();
    }

}
