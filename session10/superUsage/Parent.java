package ro.siit.session10.superUsage;

public class Parent {
    private String member = "parent";
    public void parentMethod(){
        System.out.println("Parent method");
    }

    private void privateMethod(){

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Parent{");
        sb.append("member='").append(member).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public Parent(){
        System.out.println("Parent constructor");
    }
}
