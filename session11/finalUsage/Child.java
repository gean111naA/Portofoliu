package ro.siit.session11.finalUsage;

public class Child extends Parent{

    private final String PERSON_IDENTIFICATION /* = "value"*/;

    public void m2(){

    }

    public Child(String identification){
        this.PERSON_IDENTIFICATION = identification;
    }

    public Child(){
        this("no id");
    }

//    public void setIdentification(String identification){
//        this.identification = identification;
//    }

    public String getIdentification() {
        return PERSON_IDENTIFICATION;
    }


    //    public void m1(){
//
//    }

    public static void main(String[] args) {
        Child child = new Child("id1");
        System.out.println(child.PERSON_IDENTIFICATION);

        // child.identification = "someId";

        child.m1();
        child.m2();
        Parent parent = new Parent();
        parent.m1();

        Child child2 = new Child("id2");
        System.out.println(child2.PERSON_IDENTIFICATION);

        Child child3 = new Child();
    }
}
