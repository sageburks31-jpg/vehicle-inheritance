package com.pluralsight;

public class HoverCraft extends  AmphibiusVehicle {

    public String toRowCar(){return toRowAmphibiousVehicle();}

    public HoverCraft() {}

    public HoverCraft(int numberOfPropellers) {
        super(numberOfPropellers);
    }
}
