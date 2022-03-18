package com.nology;

public class Van extends Vehicles {

    private static final int spotsNeeded = 3;
    private static final String size = "large";

    public Van() {
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
