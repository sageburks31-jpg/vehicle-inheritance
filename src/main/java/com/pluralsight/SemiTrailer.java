package com.pluralsight;


import java.util.ArrayList;

public class SemiTrailer extends TerrestrialVehicle{

    String trailerType;

    public String toRowSemiTrailer() {return trailerType + "|" + toRowTerrestrialVehicle();}

    public SemiTrailer(String trailerType) {this.trailerType = trailerType;}

    public SemiTrailer(ArrayList<Wheel> wheels, String trailerType) {
        super(wheels);
        this.trailerType = trailerType;
    }
    public SemiTrailer(String name, String color, int numberOfPassengers, int cargoCapacity, double fuelCapacity, int maxSpeed, double currentSpeed, ArrayList<Wheel> wheels, String trailerType) {
        super(name, color, numberOfPassengers, cargoCapacity, fuelCapacity, maxSpeed, currentSpeed, wheels);
        this.trailerType = trailerType;
    }
    public SemiTrailer(String name, String color, int numberOfPassengers, int cargoCapacity, double fuelCapacity, int maxSpeed, double currentSpeed, String trailerType) {
        super(name, color, numberOfPassengers, cargoCapacity, fuelCapacity, maxSpeed, currentSpeed);
        this.trailerType = trailerType;
    }
    public SemiTrailer() {}

    public SemiTrailer(ArrayList<Wheel> wheels) {
        super(wheels);
    }

    public SemiTrailer(String name, String color, int numberOfPassengers, int cargoCapacity, double fuelCapacity, int maxSpeed, double currentSpeed, ArrayList<Wheel> wheels) {
        super(name, color, numberOfPassengers, cargoCapacity, fuelCapacity, maxSpeed, currentSpeed, wheels);
    }

    public SemiTrailer(String name, String color, int numberOfPassengers, int cargoCapacity, double fuelCapacity, int maxSpeed, double currentSpeed) {
        super(name, color, numberOfPassengers, cargoCapacity, fuelCapacity, maxSpeed, currentSpeed);
    }
}
