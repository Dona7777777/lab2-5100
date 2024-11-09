package edu.neu.mgen.lab2.animalType;


import edu.neu.mgen.lab2.Animals;

public class Birds extends Animals {
    private String speciesName;
    private double wingspan;
    private int numberOfLegs;

    public Birds(double weight, String size, boolean isPredator, String speciesName, double wingspan, int numberOfLegs) {
        super(weight, size, isPredator);
        this.speciesName = speciesName;
        this.wingspan = wingspan;
        this.numberOfLegs = numberOfLegs;
    }

    public String getSpeciesName(){
        return speciesName;
    }

    public  double getWingspan(){
        return wingspan;
    }
   public int getNumberOfLegs(){
        return numberOfLegs;
   }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Species: " + speciesName);
        System.out.println("Wingspan: " + wingspan + " meters");
        System.out.println("Number of Legs: " + numberOfLegs);
    }
}
