package com.pluralsight;

import java.util.*;

public class TerrestrialVehicle extends Vehicle {

    ArrayList<Wheel> wheels = new ArrayList<>();

    public TerrestrialVehicle() {}

    public TerrestrialVehicle(ArrayList<Wheel> wheels) {
        this.wheels = wheels;
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
