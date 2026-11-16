package com.pluralsight;

import java.util.*;

public class TerrestrialVehicle extends Vehicle {

    ArrayList<Wheel> wheels = new ArrayList<>();

    public String toRowTerrestrialVehicle() {
        return String.format("%s | %s |",
                wheels.get(0).toRowWheel(),
                toRowVehicle());
    }

}
