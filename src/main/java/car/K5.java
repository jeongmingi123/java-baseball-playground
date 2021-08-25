package car;

public class K5 extends Car {


    public K5(double tripDistance) {
        super(tripDistance);
    }

    @Override
    String getName() {
        super.name = "K5";
        return super.name;
    }

    @Override
    double getDistancePerLiter() {
        super.distancePerLiter = 13;
        return super.distancePerLiter;
    }

}
