package com.pluralsight;


public class SemiTrailer extends TerrestrialVehicle{

    String trailerType;

    public String toRowSemiTrailer() {return trailerType + "|" + toRowTerrestrialVehicle();}

    public SemiTrailer(String trailerType) {this.trailerType = trailerType;}
    public SemiTrailer() {}
}
