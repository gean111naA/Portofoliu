package ro.siit.session8.inheritance;

import java.util.ArrayList;
import java.util.List;

public class Country {
    private List<Inhabitant> inhabitantList = new ArrayList<>();
    public static void main(String[] args) {
        Country romania = new Country();
        Grownup filip = new Grownup();
        filip.setId("Filip");
        romania.inhabitantList.add(filip);
        // filip.introduceYourself();

        Child codrut = new Child();
        codrut.setId("Codrut");
        romania.inhabitantList.add(codrut);
        codrut.getId();

        Inhabitant johnDoe = new Grownup();
        johnDoe.setId("John Doe");
        // johnDoe.introduceYourself();
        romania.inhabitantList.add(johnDoe);

        for (Inhabitant inhabitant: romania.inhabitantList) {
            inhabitant.introduceYourself();
            // inhabitant.method();
        }

        filip.method();

        Grownup jdoeAsGrownUp = (Grownup) johnDoe;
        jdoeAsGrownUp.method();

    }
}
