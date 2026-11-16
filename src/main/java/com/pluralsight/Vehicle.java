package com.pluralsight;

public class Vehicle {
    private String name;
    private String color;
    private int numberOfPassengers;
    private int cargoCapacity;
    private double fuelCapacity;
    private int maxSpeed;
    private double currentSpeed;


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public String toRowVehicle(){
        return String.format("%s | %s | %d | %d | %f | %d | %f",
                name,
                color,
                numberOfPassengers,
                cargoCapacity,
                fuelCapacity,
                maxSpeed,
                currentSpeed);
    }

}
