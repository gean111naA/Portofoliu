package ro.siit.session14.sets;

import ro.siit.session13.arrays.Animal;
import ro.siit.session13.arrays.Dog;

import java.util.HashSet;
import java.util.Set;

public class MainSets {
    public static void main(String[] args) {
        Set<Animal> animals = new HashSet<>();
        Dog dog1 = new Dog();
        animals.add(dog1);
        Dog dog2 = new Dog();
        animals.add(dog2);

        dog1.hashCode();

        System.out.println(dog1.equals(dog2));
        // System.out.println(dog1.equals(dog1));

        System.out.println(animals.size());

        for (Animal animal: animals
             ) {
            animal.act();
        }
    }
}
