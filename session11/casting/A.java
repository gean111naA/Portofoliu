package ro.siit.session11.casting;

public class A {
    public void mA(){
        System.out.println("Method in A");
    }
    public static void main(String[] args) {
        A obj = new B();

        ((B)obj).m();

        A obj2 = new C();
        // ((B)obj2).m();

        B obj3 = new B();
        ((A)obj3).mA();

        A obj4 = new D();
        ((C)obj4).mC();
    }
}
