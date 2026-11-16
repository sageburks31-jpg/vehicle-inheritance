package com.pluralsight;

public class Vehicle {
    private String name;
    private String color;
    private int numberOfPassengers;
    private int cargoCapacity;
    private double fuelCapacity;
    private int maxSpeed;
    private double currentSpeed;

    public Vehicle() {}
    public Vehicle(String name, String color, int numberOfPassengers, int cargoCapacity, double fuelCapacity, int maxSpeed, double currentSpeed) {
        this.name = name;
        this.color = color;
        this.numberOfPassengers = numberOfPassengers;
        this.cargoCapacity = cargoCapacity;
        this.fuelCapacity = fuelCapacity;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = currentSpeed;
    }

    public String getColor() {return color;}

    public void setColor(String color) {this.color = color;}

    public int getNumberOfPassengers() {return numberOfPassengers;}

    public void setNumberOfPassengers(int numberOfPassengers) {this.numberOfPassengers = numberOfPassengers;}

    public int getCargoCapacity() {return cargoCapacity;}

    public void setCargoCapacity(int cargoCapacity) {this.cargoCapacity = cargoCapacity;}

    public double getFuelCapacity() {return fuelCapacity;}

    public void setFuelCapacity(double fuelCapacity) {this.fuelCapacity = fuelCapacity;}

    public String toRowVehicle(){
        return String.format(" name: %s | color: %s | number Of Passengers: %d | cargo Capacity: %d | fuel Capacity: %.2f | max Speed: %d | currentSpeed:  %.2f",
                name,
                color,
                numberOfPassengers,
                cargoCapacity,
                fuelCapacity,
                maxSpeed,
                currentSpeed);
    }

}
