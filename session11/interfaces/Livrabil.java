package ro.siit.session11.interfaces;

public class Livrabil {
    private final String AWB;
    String getAWB(){
        return this.AWB;
    }

    public Livrabil(String awb){
        this.AWB = awb;
    }
}
