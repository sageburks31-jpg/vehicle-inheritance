package com.pluralsight;

public class Wheel {

    int size;
    double traction;
    int approximateUseCount;
    int currentUseCount;


    public Wheel() {}
    public Wheel(int size, double traction, int approximateUseCount, int currentUseCount) {
        this.size = size;
        this.traction = traction;
        this.approximateUseCount = approximateUseCount;
        this.currentUseCount = currentUseCount;
    }

    public int getSize() {return size;}

    public void setSize(int size) {this.size = size;}

    public double getTraction() {return traction;}

    public void setTraction(double traction) {this.traction = traction;}

    public int getApproximateUseCount() {return approximateUseCount;}

    public void setApproximateUseCount(int approximateUseCount) {this.approximateUseCount = approximateUseCount;}

    public int getCurrentUseCount() {return currentUseCount;}

    public void setCurrentUseCount(int currentUseCount) {this.currentUseCount = currentUseCount;}

    public String toRowWheel() {return String.format("%d | %.2f | %d | %d",size,traction,approximateUseCount,currentUseCount);}
}
