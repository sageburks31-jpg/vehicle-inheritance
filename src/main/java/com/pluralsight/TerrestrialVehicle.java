package com.pluralsight;

import java.util.*;

public class TerrestrialVehicle extends Vehicle {

    ArrayList<Wheel> wheels = new ArrayList<>();

    public TerrestrialVehicle() {}
    public TerrestrialVehicle(ArrayList<Wheel> wheels) {
        this.wheels = wheels;
    }
    public TerrestrialVehicle(String name, String color, int numberOfPassengers, int cargoCapacity, double fuelCapacity, int maxSpeed, double currentSpeed, ArrayList<Wheel> wheels) {
        super(name, color, numberOfPassengers, cargoCapacity, fuelCapacity, maxSpeed, currentSpeed);
        this.wheels = wheels;
    }
    public TerrestrialVehicle(String name, String color, int numberOfPassengers, int cargoCapacity, double fuelCapacity, int maxSpeed, double currentSpeed) {
        super(name, color, numberOfPassengers, cargoCapacity, fuelCapacity, maxSpeed, currentSpeed);
    }

    public String toRowTerrestrialVehicle() {

        if (wheels.isEmpty()) {
            return String.format("%s |",
                    toRowVehicle());
        }
        return String.format("%s | %s |",
                wheels.get(0).toRowWheel(),
                toRowVehicle());
    }

}
