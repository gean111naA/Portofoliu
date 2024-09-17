package ro.siit.session4;

public class BooleanValues {
    public static void main(String[] args) {
        boolean a = false;
        boolean b = false;

        if(a){
            System.out.println("a is true");
        } else {
            System.out.println("a is false");
        }

        if(b){
            System.out.println("b is true");
        } else {
            System.out.println("b is false");
        }

        if(a || b){
            System.out.println("one of them is true");
        } else {
            System.out.println("none of them is true");
        }

        if(a && b){
            System.out.println("both of them are true");
        } else {
            System.out.println("one of them is false");
        }
    }
}
