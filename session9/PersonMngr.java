package ro.siit.session9;

public class PersonMngr {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("Filip");
        p1.salutation = "dl.";
        p1.setIBAN("123456789");

        Person p2 = new Person();
        p2.setName("He");
        p2.salutation = "Mr.";

        System.out.println(p1.getFullName("en"));
        System.out.println(p2.getFullName("ro"));
        System.out.println(p1.printIban());

    }
}
