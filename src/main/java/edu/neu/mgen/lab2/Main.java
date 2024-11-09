package edu.neu.mgen.lab2;

import edu.neu.mgen.lab2.animalType.Birds;
import edu.neu.mgen.lab2.animalType.Fish;
import edu.neu.mgen.lab2.animalType.Land;

public class Main {
    public static void main(String[] args) {
        Birds eagle = new Birds(1.0, "6.5", true, "Eagle", 2.3, 2);
        Land tiger = new Land(2.5, "220", true, "Tiger", 4, false);
        Fish salmon = new Fish(1.2, "15", false, "Salmon", true, 2);

        System.out.println("Bird Information:");
        eagle.displayInfo();
        System.out.println("=======================================");
        System.out.println("\nLand Animal Information:");
        tiger.displayInfo();
        System.out.println("=======================================");
        System.out.println("\nFish Information:");
        salmon.displayInfo();
        System.out.println("=======================================");

    }
}

