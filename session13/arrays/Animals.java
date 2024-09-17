package ro.siit.session13.arrays;

public class Animals {
    public static void main(String[] args) {
        Animal[] animals = new Animal[6];
        for (int a = 0; a < animals.length; a++) {
            if(a%3 == 0){
                animals[a] = new Dog();
            } else {
                animals[a] = new Cat();
            }
        }

        for (Animal animal: animals) {
            animal.act();
        }
    }
}
