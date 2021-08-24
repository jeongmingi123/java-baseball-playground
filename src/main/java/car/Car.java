package car;

public abstract class Car {

    protected int liter;
    protected int fuelEfficiency;
    protected int distance;
    protected String name;

    public Car(int distance) {
        this.distance = distance;
    }

    abstract double getDistancePerLiter();
    abstract double getTripDistance();
    abstract String getName();

    double getChargeQuantity() {
        return getTripDistance() / getDistancePerLiter();
    }

}
