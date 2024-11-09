package edu.neu.mgen.lab2.animalType;

import edu.neu.mgen.lab2.Animals;

public class Fish extends Animals {
    private String speciesName;
    private boolean isMarineFish;
    private int numberOfFins;
    public Fish(double weight,String size,boolean isPredator,String speciesName, boolean isMarineFish, int numberOfFins) {
        super(weight,size, isPredator);
        this.speciesName = speciesName;
        this.isMarineFish = isMarineFish;
        this.numberOfFins = numberOfFins;
    }
    public String getSpeciesName() {
        return speciesName;
    }
    public boolean isMarinFish() {
        return isMarineFish;
    }
    public int getNumberOfFins() {
        return numberOfFins;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Species: " + speciesName);
        System.out.println("Number of Fins: " + numberOfFins);
        System.out.println("Marine: " + isMarineFish);
    }
}
