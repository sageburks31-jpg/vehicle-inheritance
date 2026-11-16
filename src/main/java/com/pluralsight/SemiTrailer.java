package com.pluralsight;


public class SemiTrailer extends TerrestrialVehicle{

    String trailerType;

    public String toRowSemiTrailer(){
        return trailerType + "|" + toRowTerrestrialVehicle();
    }
}
