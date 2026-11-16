package com.pluralsight;

import java.util.ArrayList;

public class Car extends TerrestrialVehicle {

    public String toRowCar(){return toRowTerrestrialVehicle();}

    public Car() {}
    public Car(ArrayList<Wheel> wheels) {super(wheels);}
    public Car(String name, String color, int numberOfPassengers, int cargoCapacity, double fuelCapacity, int maxSpeed, double currentSpeed, ArrayList<Wheel> wheels) {super(name, color, numberOfPassengers, cargoCapacity, fuelCapacity, maxSpeed, currentSpeed, wheels);}
    public Car(String name, String color, int numberOfPassengers, int cargoCapacity, double fuelCapacity, int maxSpeed, double currentSpeed) {super(name, color, numberOfPassengers, cargoCapacity, fuelCapacity, maxSpeed, currentSpeed);}
}
