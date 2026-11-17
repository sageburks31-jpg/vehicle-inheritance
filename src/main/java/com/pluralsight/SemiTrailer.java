package com.pluralsight;


import java.util.ArrayList;

public class SemiTrailer extends TerrestrialVehicle{

    String trailerType;
    int maxStorageCapacity=0;
    int currentStorageCapacity=0;

    public SemiTrailer() {}
    public SemiTrailer(String trailerType, int maxStorageCapacity, int currentStorageCapacity) {
        this.trailerType = trailerType;
        this.maxStorageCapacity = maxStorageCapacity;
        this.currentStorageCapacity = currentStorageCapacity;
    }

    public SemiTrailer(ArrayList<Wheel> wheels, String trailerType, int maxStorageCapacity, int currentStorageCapacity) {
        super(wheels);
        this.trailerType = trailerType;
        this.maxStorageCapacity = maxStorageCapacity;
        this.currentStorageCapacity = currentStorageCapacity;
    }
    public SemiTrailer(String name, String color, int numberOfPassengers, int cargoCapacity, double fuelCapacity, int maxSpeed, double currentSpeed, ArrayList<Wheel> wheels, String trailerType, int maxStorageCapacity, int currentStorageCapacity) {
        super(name, color, numberOfPassengers, cargoCapacity, fuelCapacity, maxSpeed, currentSpeed, wheels);
        this.trailerType = trailerType;
        this.maxStorageCapacity = maxStorageCapacity;
        this.currentStorageCapacity = currentStorageCapacity;
    }
    public SemiTrailer(String name, String color, int numberOfPassengers, int cargoCapacity, double fuelCapacity, int maxSpeed, double currentSpeed, String trailerType, int maxStorageCapacity, int currentStorageCapacity) {
        super(name, color, numberOfPassengers, cargoCapacity, fuelCapacity, maxSpeed, currentSpeed);
        this.trailerType = trailerType;
        this.maxStorageCapacity = maxStorageCapacity;
        this.currentStorageCapacity = currentStorageCapacity;
    }

    public String getTrailerType() {return trailerType;}
    public void setTrailerType(String trailerType) {this.trailerType = trailerType;}

    public int getMaxStorageCapacity() {return maxStorageCapacity;}
    public void setMaxStorageCapacity(int maxStorageCapacity) {this.maxStorageCapacity = maxStorageCapacity;}

    public int getCurrentStorageCapacity() {return currentStorageCapacity;}
    public void setCurrentStorageCapacity(int currentStorageCapacity) {this.currentStorageCapacity = currentStorageCapacity;}

    public String toRowSemiTrailer() {return trailerType + "|" + toRowTerrestrialVehicle();}
}
