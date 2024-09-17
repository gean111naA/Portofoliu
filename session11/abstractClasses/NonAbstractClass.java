package ro.siit.session11.abstractClasses;

public class NonAbstractClass extends AbstractClass {
    @Override
    public void m2() {
        System.out.println("m2");
    }

    public static void main(String[] args) {
        NonAbstractClass nonAbstractClass = new NonAbstractClass();
        nonAbstractClass.m1();
        nonAbstractClass.m2();
    }
}
