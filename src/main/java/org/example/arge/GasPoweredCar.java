package org.example.arge;

public class GasPoweredCar extends CarSkeleton{
    private double avarageKmPerLiter;
    private int cylinders;

    public GasPoweredCar(String name, String description, double avarageKmPerLiter, int cylinders) {
        super(name, description);
        this.avarageKmPerLiter = avarageKmPerLiter;
        this.cylinders = cylinders;
    }

    public double getAverageKmPerLiter() {
        return avarageKmPerLiter;
    }

    public int getCylinders() {
        return cylinders;
    }

}
