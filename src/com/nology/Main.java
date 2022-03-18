package com.nology;

public class Main {

    public static void main(String[] args) {

        Car honda = new Car();
        ParkingLot asda = new ParkingLot(100, 300,40);
        System.out.println(asda.totalSpots());
        System.out.println(asda.remainingSpots());
        asda.addMultipleCars(100);
        System.out.println(asda.totalSpots());
        System.out.println(asda.remainingSpots());

    }
}
