package ro.siit.session10.shareability;

public class Main {
    public static void main(String[] args) {
        Address commonAddress = new Address("Bucuresti", "Dinicu Golescu", 1);
        Person p1 = new Person("P1", commonAddress);
        Person p2 = new Person("P2", commonAddress);
        printInfo(p1, p2);

        commonAddress.setStreet("Vasile Goldis");

        printInfo(p1, p2);
    }

    private static void printInfo(Person p1, Person p2){
        System.out.println("------------");
        System.out.println(p1);
        System.out.println(p2);
    }
}
