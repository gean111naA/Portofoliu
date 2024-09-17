package ro.siit.session10.shareability;

public class MainOld {
    public static void main(String[] args) {
        PersonOld p1 = new PersonOld("P1", "City 1, Street 1");
        PersonOld p2 = new PersonOld("P2", "City 1, Street 1");
        printInfo(p1, p2);
        // Street 1 -> Street 2
        p1.setAddress("City 1, Street 2");
        p2.setAddress("city 1, Street 2");
        printInfo(p1, p2);



    }

    private static void printInfo(PersonOld p1, PersonOld p2){
        System.out.println("------------");
        System.out.println(p1);
        System.out.println(p2);
    }
}
