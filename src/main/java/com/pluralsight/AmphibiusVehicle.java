package com.pluralsight;

public class AmphibiusVehicle extends Vehicle {
    int numberOfPropellers;


    public AmphibiusVehicle() {}
    public AmphibiusVehicle(int numberOfPropellers) {
        this.numberOfPropellers = numberOfPropellers;
    }

    public String toRowAmphibiousVehicle(){
        return String.format("%d | %s |",
                numberOfPropellers,
                toRowVehicle());    }
}
