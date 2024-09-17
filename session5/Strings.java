package ro.siit.session5;

public class Strings {
    public static void main(String[] args) {
        String prop = "Ana";
        String bk = prop;
        prop += " are mere";
        String bk2 = bk + " are mere";

        // prop, bk2 -> "Ana are mere"
        // bk -> "Ana"

        System.out.println(prop);

        int a = 1;
        int b = 1;
        a = 7;
    }
}
