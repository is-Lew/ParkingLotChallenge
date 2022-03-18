package com.nology;

public class Car extends Vehicles {

    private static final int spotsNeeded = 1;
    private static final String size = "regular";

    public Car() {
        super(spotsNeeded, size);
    }

    public boolean park (int spaces) {
        if (spaces > 3) {
            return true;
        } else {
            return false;
        }
    }

}
