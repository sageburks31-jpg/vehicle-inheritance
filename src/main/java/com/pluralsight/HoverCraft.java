package com.pluralsight;

public class HoverCraft extends  AmphibiusVehicle {

    public HoverCraft() {}
    public HoverCraft(int numberOfPropellers) {super(numberOfPropellers);}

    public String toRowHoverCraft(){return toRowAmphibiousVehicle();}
}
