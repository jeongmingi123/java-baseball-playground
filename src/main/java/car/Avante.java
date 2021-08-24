package car;

public class Avante extends Car{

    public Avante(int distance) {
        super(distance);
    }

    @Override
    double getDistancePerLiter() {
        return fuelEfficiency;
    }

    @Override
    double getTripDistance() {
        return distance;
    }

    @Override
    String getName() {
        return this.name;
    }
}
