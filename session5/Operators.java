package ro.siit.session5;

public class Operators {
    public static void main(String[] args) {
        int a = 2;
        a++; // a = a + 1;
        ++a; // a = a + 1;
        System.out.println(a);

        int b = ++a;
        // a = a+1;
        // b = a;

        System.out.println(a);
        System.out.println(b);

        b = a++;
        // b = a;
        // a = a+1;
        System.out.println(a);
        System.out.println(b);

        // ? :
        boolean expr = false;

        if (expr == true){
            b = a + 2;
        } else {
            b = 20 * a;
        }

        System.out.println(b);

        b = expr ? a + 2 :  - 20 * a;
        System.out.println(b);


        int c = a > b ? a : b;
        System.out.println(c);
    }
}
