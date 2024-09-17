package ro.siit.session11.interfaces;

public class Colet extends Livrabil implements Heavy, DeliverableByBike{
    private String bikersName;
    public Colet(String awb, String bikersName) {
        super(awb);
        this.bikersName = bikersName;
    }

    @Override
    public double getWeight() {
        return 10;
    }

    @Override
    public String getBikeDriversName() {
        return this.bikersName;
    }
}
