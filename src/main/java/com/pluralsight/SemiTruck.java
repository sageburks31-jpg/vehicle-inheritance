package com.pluralsight;

import java.util.ArrayList;

public class SemiTruck extends TerrestrialVehicle {

    SemiTrailer semiTrailer;

    public SemiTruck() {}

    public SemiTruck(ArrayList<Wheel> wheels) {
        super(wheels);
    }
    public SemiTruck(String name, String color, int numberOfPassengers, int cargoCapacity, double fuelCapacity, int maxSpeed, double currentSpeed, ArrayList<Wheel> wheels) {
        super(name, color, numberOfPassengers, cargoCapacity, fuelCapacity, maxSpeed, currentSpeed, wheels);
    }
    public SemiTruck(String name, String color, int numberOfPassengers, int cargoCapacity, double fuelCapacity, int maxSpeed, double currentSpeed) {
        super(name, color, numberOfPassengers, cargoCapacity, fuelCapacity, maxSpeed, currentSpeed);
    }
    public SemiTruck(SemiTrailer semiTrailer) {this.semiTrailer = semiTrailer;}
    public SemiTruck(ArrayList<Wheel> wheels, SemiTrailer semiTrailer) {
        super(wheels);
        this.semiTrailer = semiTrailer;
    }
    public SemiTruck(String name, String color, int numberOfPassengers, int cargoCapacity, double fuelCapacity, int maxSpeed, double currentSpeed, ArrayList<Wheel> wheels, SemiTrailer semiTrailer) {
        super(name, color, numberOfPassengers, cargoCapacity, fuelCapacity, maxSpeed, currentSpeed, wheels);
        this.semiTrailer = semiTrailer;
    }
    public SemiTruck(String name, String color, int numberOfPassengers, int cargoCapacity, double fuelCapacity, int maxSpeed, double currentSpeed, SemiTrailer semiTrailer) {
        super(name, color, numberOfPassengers, cargoCapacity, fuelCapacity, maxSpeed, currentSpeed);
        this.semiTrailer = semiTrailer;
    }

    public SemiTrailer getSemiTrailer() {return semiTrailer;}

    public boolean hasSemiTrailer() {return semiTrailer != null;}

    public void setSemiTrailer(SemiTrailer semiTrailer) {this.semiTrailer = semiTrailer;}

    public String toRowTruck(){return semiTrailer.toRowSemiTrailer() + "|" + toRowTerrestrialVehicle();}
}
