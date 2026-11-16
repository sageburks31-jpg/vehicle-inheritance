package com.pluralsight;

public class SemiTruck extends TerrestrialVehicle {

    SemiTrailer semiTrailer;

    public SemiTruck() {}
    public SemiTruck(SemiTrailer semiTrailer) {this.semiTrailer = semiTrailer;}

    public SemiTrailer getSemiTrailer() {return semiTrailer;}

    public boolean hasSemiTrailer() {return semiTrailer != null;}

    public void setSemiTrailer(SemiTrailer semiTrailer) {this.semiTrailer = semiTrailer;}

    public String toRowTruck(){return semiTrailer.toRowSemiTrailer() + "|" + toRowTerrestrialVehicle();}
}
