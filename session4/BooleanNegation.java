package ro.siit.session4;

public class BooleanNegation {
    public static void main(String[] args) {
        // boolean a = true;
        // System.out.println(!a);
        // v1 = true;
        boolean v1 = true;
        boolean v2 = true;

        // System.out.println(v1 && v2);

        System.out.println(!(v1 && v2));

        System.out.println(!v1 || !v2);

        System.out.println(!(v1 && v2) == !v1 || !v2);


        // !(p&&q) == !p || !q
        // !(p||q) == !p && !q

        // !(p&&q) == !p && !q
        // v1 = false;
    }
}
