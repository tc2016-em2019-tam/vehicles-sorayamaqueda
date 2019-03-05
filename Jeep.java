package com.company;

public class Jeep extends Vehicle implements LandVehicle{
    private int numWheels;

    public Jeep(String name, int maxPassengers, double maxSpeed, int numWheels) {
        super(name, maxPassengers, maxSpeed);
        this.numWheels = numWheels;
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

    public void soundHorn(){
        System.out.println("Beep, beep!");
    }
}
