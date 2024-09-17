package ro.siit.session14.comparing;

import ro.siit.session14.model.Masina;

import java.util.Comparator;

public class YearComparator implements Comparator<Masina> {
    @Override
    public int compare(Masina o1, Masina o2) {
        return o1.getAnFabricatie().compareTo(o2.getAnFabricatie());
    }
}
