package edu.neu.mgen.lab2.animalType;

import edu.neu.mgen.lab2.Animals;

public class Land extends Animals {
    private String speciesName;
    private int numberOfLegs;
    private boolean isMammal;
    public Land(double weight,String size,boolean isPredator,String speciesName, int numberOfLegs, boolean isMammal) {
        super(weight,size,isPredator);
        this.speciesName = speciesName;
        this.numberOfLegs = numberOfLegs;
        this.isMammal = isMammal;
    }
    public String getSpeciesName() {
        return speciesName;
    }
    public int getNumberOfLegs() {
        return numberOfLegs;
    }
    public boolean isMammal() {
        return isMammal;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Species: " + speciesName);
        System.out.println("Number of Legs: " + numberOfLegs);
        System.out.println("Mammal: " + (isMammal ? "Yes" : "No"));
    }
}
