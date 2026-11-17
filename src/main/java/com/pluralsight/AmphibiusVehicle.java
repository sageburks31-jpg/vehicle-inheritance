package com.pluralsight;

public class AmphibiusVehicle extends Vehicle {
    int numberOfPropellers;

    public AmphibiusVehicle() {}
    public AmphibiusVehicle(int numberOfPropellers) {
        this.numberOfPropellers = numberOfPropellers;
    }

    public AmphibiusVehicle(String name, String color, int numberOfPassengers, int cargoCapacity, double fuelCapacity, int maxSpeed, double currentSpeed, int numberOfPropellers) {
        super(name, color, numberOfPassengers, cargoCapacity, fuelCapacity, maxSpeed, currentSpeed);
        this.numberOfPropellers = numberOfPropellers;
    }
    public AmphibiusVehicle(String name, String color, int numberOfPassengers, int cargoCapacity, double fuelCapacity, int maxSpeed, double currentSpeed) {
        super(name, color, numberOfPassengers, cargoCapacity, fuelCapacity, maxSpeed, currentSpeed);
    }

    public int getNumberOfPropellers() {return numberOfPropellers;}
    public void setNumberOfPropellers(int numberOfPropellers) {this.numberOfPropellers = numberOfPropellers;}

    public String toRowAmphibiousVehicle(){
        return String.format("%d | %s |",
                numberOfPropellers,
                toRowVehicle());    }
}
