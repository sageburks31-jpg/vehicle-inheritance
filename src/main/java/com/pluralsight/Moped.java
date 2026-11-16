package com.pluralsight;

public class Moped extends TerrestrialVehicle {

    public String toRowTruck(){
        return "|" + toRowTerrestrialVehicle();
    }
}
