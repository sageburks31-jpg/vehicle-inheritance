package com.pluralsight;

public class AmphibiusVehicle extends Vehicle {
    int numberOfPropellers;

    public String toRowAmphibiousVehicle(){
        return String.format("%d | %s |",
                numberOfPropellers,
                toRowVehicle());    }
}
