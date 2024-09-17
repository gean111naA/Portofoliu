package ro.siit.session14.comparing;

import ro.siit.session14.model.Masina;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class ComparingMain {
    public static void main(String[] args) {
        Set<Masina> masini = new TreeSet<>();
        masini.add(new Masina("Renault", 2023, 1234.5));
        masini.add(new Masina("Bentley", 1990, 12332324.5));
        masini.add(new Masina("Audi", 2019, 12534.5));
        masini.add(new Masina("AudiX", 2019, 14.5));

        print(masini);

        Set<Masina> masiniByYear = new TreeSet<>(new YearComparator());
        masiniByYear.addAll(masini);

        print(masiniByYear);

        Set<Masina> masiniByKms = new TreeSet<>((o1, o2) -> {
            if(o1.getKm() < o2.getKm()){
                return -1000; // -1
            } else if(o1.getKm() > o2.getKm()){
                return 12; // 1
            } else {
                return 0;
            }
        });
        masiniByKms.addAll(masini);

        print(masiniByKms);

    }

    private static void print(Set<Masina> masini) {
        for (Masina masina: masini
             ) {
            System.out.println(masina);
        }


        System.out.println("-------");
    }
}
