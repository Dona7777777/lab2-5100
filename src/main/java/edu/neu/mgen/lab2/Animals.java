package edu.neu.mgen.lab2;

public class Animals {
    double weight;
    String size;
    boolean isPredator;


    public Animals(double weight, String size, boolean isPredator){
        this.weight = weight;
        this.size = size;
        this.isPredator = isPredator;

    }
    public String getSize() {
        return size;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isPredator() {
        return isPredator;
    }

    public void displayInfo() {
        System.out.println("Size: " + size + " meters");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Predator: " + (isPredator ? "Yes" : "No"));
    }

}
