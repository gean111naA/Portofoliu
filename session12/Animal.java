package ro.siit.session12;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Animal {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();

        animals.add(new Dog());
        animals.add(new Cat());

        print(animals);

        List<Dog> dogs = new ArrayList<>();
        print(dogs);
        List<Cat> cats  = new Vector<>();
        print(cats);

        // Animal <- Cat
        // List <- ArrayList
        // List<Animal> <- ArrayList<Cat>

    }

    public static void print(List<? extends Animal> list){
        for (Animal a:list) {
            System.out.println(a);
        }
        // list.add(new Cat());
    }

    public static void print1(List<? super Dog> list){
        for (Object a:list) {
            System.out.println(a);
        }

        list.add(new Dog());
    }
}
