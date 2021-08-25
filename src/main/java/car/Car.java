package car;

public abstract class Car {

    protected double tripDistance;
    protected String name;
    protected double distancePerLiter;


    public Car(double tripDistance) {
        this.tripDistance = tripDistance;
    }

    double getChargeQuantity() {
        return getTripDistance() / getDistancePerLiter();
    }
    double getTripDistance(){
        return this.tripDistance;
    }

    abstract String getName();

    abstract double getDistancePerLiter();

}
