package com.pluralsight;

public class Moped extends TerrestrialVehicle {

    public Moped() {}

    public String toRowMoped(){return "|" + toRowTerrestrialVehicle();}
}
