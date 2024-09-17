package ro.siit.session11.interfaces;

public class Palet extends Livrabil implements Heavy{
    public Palet(String awb) {
        super(awb);
    }

    @Override
    public double getWeight() {
        return 100;
    }
}
