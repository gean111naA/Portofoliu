package ro.siit.session13.arrays;

import java.util.Objects;

public class Dog  implements Animal{
    private String name;
    public Dog(String name){
        this.name = name;
    }

    public Dog(){
        this.name = "Azorica";
    }
    @Override
    public void act() {
        System.out.println("Bark " + name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(name, dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
