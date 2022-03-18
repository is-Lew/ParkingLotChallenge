package com.nology;

public class Motorcycle extends Vehicles {

    private static final int spotsNeeded = 1;
    private static final String size = "compact";

    public Motorcycle() {
        super(spotsNeeded, size);
    }

    public boolean park (int spaces) {
        if (spaces > 1) {
            return true;
        } else {
            return false;
        }
    }
}
