package ro.siit.session10;

public class Hierarchy {
    A a1 = new B();
    A a2 = new C();

    B b = (B) a1;
}

class A{}
class B extends A{}
class C extends A{}
