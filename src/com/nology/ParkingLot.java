package com.nology;

public class ParkingLot {

    private int regularSpots;
    private int compactSpots;
    private int motorcycleSpots;

    private int takenSpots;
    private int numberOfVans;

    public ParkingLot(int regularSpots, int compactSpots, int motorcycleSpots) {
        this.regularSpots = regularSpots;
        this.compactSpots = compactSpots;
        this.motorcycleSpots = motorcycleSpots;
    }

    public int getNumberOfVans() {
        return numberOfVans;
    }

    public void setNumberOfVans(int numberOfVans) {
        this.numberOfVans += numberOfVans;
    }

    public int getTakenSpots() {
        return takenSpots;
    }

    public void setTakenSpots(int spotsUsed) {
        this.takenSpots += spotsUsed;
    }

    public int getRegularSpots() {
        if (regularSpots <= 0) {
            System.out.println("There are no spots of this type available");
            return regularSpots;
        }
        return regularSpots;

    }

    public void setRegularSpots(int regularSpots) {
        this.regularSpots = regularSpots;
    }

    public int getCompactSpots() {
        if (compactSpots <= 0) {
            System.out.println("There are no spots of this type available");
            return compactSpots;
        }
        return compactSpots;
    }

    public void setCompactSpots(int compactSpots) {
        this.compactSpots = compactSpots;
    }

    public int getMotorcycleSpots() {
        if (motorcycleSpots <= 0) {
            System.out.println("There are no spots of this type available");
            return motorcycleSpots;
        }
        return motorcycleSpots;
    }

    public void setMotorcycleSpots(int motorcycleSpots) {
        this.motorcycleSpots = motorcycleSpots;
    }

    public int totalSpots () {
        return regularSpots + motorcycleSpots + compactSpots + takenSpots;
    }

    public int remainingSpots () {
        return regularSpots + motorcycleSpots + compactSpots;
    }

    public void addCar () {
        Car car = new Car();
        if (car.park(remainingSpots())) {
            if (getRegularSpots() > 0) {
                setRegularSpots(getRegularSpots()-1);
                setTakenSpots(1);
            } else if (getCompactSpots() > 0) {
                setCompactSpots(getCompactSpots() - 1);
                setTakenSpots(1);
            }
        } else {
            System.out.println("No available spaces");
        }

    }

    public void addMultipleCars (int numberOfCars) {
        if (remainingSpots() / numberOfCars > 0) {
            for (int i = 0; i < numberOfCars; i++) {
                addCar();
            }
            System.out.println( numberOfCars +" cars have been parked");
        } else {
            System.out.println("There are not enough spaces available for all of these cars, please reduce number of cars");
        }

    }
    public void addMultipleVans (int numberOfVans) {
        if (remainingSpots() / (numberOfVans*3) > 0) {
            for (int i = 0; i < numberOfVans; i++) {
                addVan();
            }
            System.out.println( numberOfVans +" cars have been parked");
        } else {
            System.out.println("There are not enough spaces available for all of these vans, please reduce number of vans");
        }

    }

    public void addMultipleMotorcycles (int numberOfMotorcycles) {
        if (remainingSpots() / numberOfMotorcycles > 0) {
            for (int i = 0; i < numberOfMotorcycles; i++) {
                addMotorcycle();
            }
            System.out.println( numberOfMotorcycles +" cars have been parked");
        } else {
            System.out.println("There are not enough spaces available for all of these motorcycles, please reduce number of motorcycles");
        }

    }

    public void addVan () {
        Van van = new Van();
        if (van.park(remainingSpots())) {
            if (getRegularSpots() > 3) {
                setRegularSpots(getRegularSpots()-3);
                setTakenSpots(3);
                setNumberOfVans(1);
            }
        } else {
            System.out.println("No available spaces");
        }

    }

    public void addMotorcycle () {
        Motorcycle motorcycle = new Motorcycle();
        if (motorcycle.park(remainingSpots())) {
            if (getMotorcycleSpots() > 0) {
                setMotorcycleSpots(getMotorcycleSpots()-1);
                setTakenSpots(1);
            } else if (getCompactSpots() > 0) {
                setCompactSpots(getCompactSpots() - 1);
                setTakenSpots(1);
            } else if (getRegularSpots() > 0) {
                setRegularSpots(getRegularSpots()-1);
                setTakenSpots(1);
            } else {
                System.out.println("No available spaces");
            }
        } else {
            System.out.println("No available spaces");
        }

    }

    public void checkIfFull () {
        if (remainingSpots() <= 0) {
            System.out.println("The car park is full");
        } else {
            System.out.println("There are still " + remainingSpots() + " remaining");
        }
    }

    public void checkIfEmpty () {
        if (takenSpots >=0) {
            System.out.println("The car park is empty");
        } else {
            System.out.println(takenSpots + " spots are in use");
        }
    }




}
