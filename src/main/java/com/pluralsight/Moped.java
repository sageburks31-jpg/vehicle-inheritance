package com.pluralsight;

import java.util.ArrayList;

public class Moped extends TerrestrialVehicle {

    public Moped() {}

    public Moped(ArrayList<Wheel> wheels) {
        super(wheels);
    }
    public Moped(String name, String color, int numberOfPassengers, int cargoCapacity, double fuelCapacity, int maxSpeed, double currentSpeed, ArrayList<Wheel> wheels) {
        super(name, color, numberOfPassengers, cargoCapacity, fuelCapacity, maxSpeed, currentSpeed, wheels);
    }
    public Moped(String name, String color, int numberOfPassengers, int cargoCapacity, double fuelCapacity, int maxSpeed, double currentSpeed) {
        super(name, color, numberOfPassengers, cargoCapacity, fuelCapacity, maxSpeed, currentSpeed);
    }

    public void ringBell() {}

    public String toRowMoped(){return "|" + toRowTerrestrialVehicle();}
}
