package ro.siit.session8.inheritance;

public class Child extends Inhabitant{
//    private String id;
    private String school;

    @Override
    public void setId(String id) {
       // System.out.println("Child");
        super.setId(id);
    }

    @Override
    public void introduceYourself() {
        System.out.print("Kinderclass ");
        super.introduceYourself();
    }

    public void method(){

    }
}
