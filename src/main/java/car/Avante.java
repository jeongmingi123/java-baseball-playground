package car;

public class Avante extends Car {

    public Avante(double tripDistance) {
        super(tripDistance);
    }

    @Override
    String getName() {
        super.name = "Avante";
        return super.name;
    }

    @Override
    double getDistancePerLiter() {
        super.distancePerLiter = 15;
        return super.distancePerLiter;
    }

}
