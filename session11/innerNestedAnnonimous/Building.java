package ro.siit.session11.innerNestedAnnonimous;

import ro.siit.session11.casting.A;

import java.util.ArrayList;
import java.util.List;

public class Building {
    List<Apartment> apartmentList = new ArrayList<>();

    class Apartment{
        private int apNo;
        Apartment(int apNo){
            this.apNo = apNo;
        }
    }

    public static void main(String[] args) {
        Building building = new Building();
        Apartment apartment = building.new Apartment(1);
        building.apartmentList.add(apartment);
    }
}
