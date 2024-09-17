package ro.siit.session13.arrays;

public class Main {
    public static void main(String[] args) {
        String sirDeCuvinte[] = new String[3];
        // 0, 1, 2
        // 7 -> 0,...,6
        // 0,..,length - 1
        sirDeCuvinte[0] = "Ana";
        sirDeCuvinte[1] = "are";
        sirDeCuvinte[2] = "mere";

        System.out.println(sirDeCuvinte.length);
        for (int i = 0; i <= sirDeCuvinte.length - 1; i++) {
            System.out.println(sirDeCuvinte[i]);
        }

    }
}
