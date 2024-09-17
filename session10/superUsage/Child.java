package ro.siit.session10.superUsage;

public class Child extends Parent{

    public Child(){
        System.out.println("Child constructor");
    }

    public Child(String nume){
        this();
        System.out.println("With name " + nume);
        // this();
    }

    @Override
    public void parentMethod() {
        super.parentMethod();
        // parentMethod();
        System.out.println("This was inherited");
    }

    public static void main(String[] args) {
        Parent child = new Child();
        // child.privateMethod();
        child.parentMethod();

        System.out.println(child);

        System.out.println("-------");
        new Child("Georgica");
    }
}
