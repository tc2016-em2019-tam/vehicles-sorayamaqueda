package com.company;

public class Hovercraft extends Vehicle implements LandVehicle, SeaVehicle {
    private int numWheels;
    private double displacement;

    public Hovercraft(String name, int maxPassengers, double maxSpeed, int numWheels, double displacement) {
        super(name, maxPassengers, maxSpeed);
        this.numWheels = numWheels;
        this.displacement = displacement;
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
        System.out.println("Calling Drive() method.");
    }

    @Override
    public double getDisplacement() {
        return displacement;
    }

    @Override
    public void setDisplacement(double displacement) {
        this.displacement = displacement;
    }

    @Override
    public void launch() {
        System.out.println("Calling Launch() method.");
    }

    public void enterLand(){
        System.out.println("Hovercraft entering land.");
    }

    public void enterSea(){
        System.out.println("Hovercraft entering sea.");
    }
}
