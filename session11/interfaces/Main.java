package ro.siit.session11.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Livrabil> livrabils = new ArrayList<>();
        List<Heavy> heavyList = new ArrayList<>();
        Colet colet = new Colet("123", "Ion Anton");
        heavyList.add(colet);
        // colet.prop = "qqqq";
        livrabils.add(colet);

        System.out.println(colet.getBikeDriversName());

        Palet palet = new Palet("ewfqwefwrefrwe");
        heavyList.add(palet);

        Plic plic = new Plic("asdad");
        // heavyList.add(plic);
        livrabils.add(plic);
        System.out.println(plic.getBikeDriversName());

        int weight = 0;
        for (Heavy heavy : heavyList) {
            weight += heavy.getWeight();
        }

        System.out.println(weight);

    }
}
