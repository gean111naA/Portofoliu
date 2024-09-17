package ro.siit.session11.interfaces;

public interface Heavy {

    String prop = "aaa";

    double getWeight();

    default int getLorryId(){
        return 1234;
    }
}
