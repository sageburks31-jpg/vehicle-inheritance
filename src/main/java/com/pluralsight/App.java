package com.pluralsight;

public class App {

    public static void main(String[] args) {

        Moped slowRide = new Moped();
        slowRide.setColor("blue");
        slowRide.setFuelCapacity(6);
        System.out.println(slowRide.toRowMoped());

        Moped slowRide2 = new Moped("erny","red",1,0,5,6,1);
        System.out.println(slowRide2.toRowMoped());
    }
}