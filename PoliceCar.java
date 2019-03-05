package com.company;

public class PoliceCar extends Vehicle implements LandVehicle, Emergency {
    private int numWheels;

    public PoliceCar(String name, int numWheels) {
        super(name);
        this.numWheels = numWheels;
    }

    public PoliceCar(String name, int maxPassengers, double maxSpeed, int numWheels) {
        super(name, maxPassengers, maxSpeed);
        this.numWheels = numWheels;
    }

    @Override
    public void sounSiren() {
        System.out.println("On pursuit!");
    }

    @Override
    public int getNumWheels() {
        return numWheels;
    }

    @Override
    public void setNumWheels() {
        this.numWheels = numWheels;
    }

    @Override
    public void Drive() {
        System.out.println("Calling Drive() mehtod.");
    }

    public void onPursuit(){
        System.out.println("Unit on pursuit!");
    }
}
