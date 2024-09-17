package ro.siit.session14.lists;

import ro.siit.session11.casting.A;
import ro.siit.session13.arrays.Animal;
import ro.siit.session13.arrays.Dog;

import java.util.ArrayList;
import java.util.List;

public class MainArrayLists {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        System.out.println(animals.size());
        animals.add(new Dog("Doberman 1"));
        System.out.println(animals.size());

        animals.add(new Dog("Doberman 2"));
        animals.add(1, new Dog());

        animals.add(animals.size() - 1, new Dog("German Shepard 1"));

        for (Animal animal: animals) {
            animal.act();
        }

    }
}
