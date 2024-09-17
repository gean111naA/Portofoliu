package ro.siit.session10.accessControl.p1;

public class C1 {
    public static void main(String[] args) {
        C1P c1p = new C1P();
        C1 c1 = new C1();
        c1.privateMethod();
    }

    public void publicMethod(){}
    private void privateMethod(){}
    void packageMethod(){}
    protected void protectedMethod(){}
}

class C1P{
    private void someCallingMethod(){
        C1 c1 = new C1();
        c1.packageMethod();
    }
}
