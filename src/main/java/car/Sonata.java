package car;

public class Sonata extends Car {


    public Sonata(double tripDistance) {
        super(tripDistance);
    }

    @Override
    String getName() {
        super.name = "Sonata";
        return super.name;
    }


    @Override
    double getDistancePerLiter() {
        super.distancePerLiter = 10;
        return super.distancePerLiter;
    }

}
