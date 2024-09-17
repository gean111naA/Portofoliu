package ro.siit.session11.interfaces;

public class Plic extends Livrabil implements DeliverableByBike{
    public Plic(String awb) {
        super(awb);
    }

    @Override
    public String getBikeDriversName() {
        return "John Doe";
    }
}
