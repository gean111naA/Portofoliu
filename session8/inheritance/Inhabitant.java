package ro.siit.session8.inheritance;

public class Inhabitant {
    private String id;

    public void setId(String id) {
        // System.out.println("Inhabitant");
       this.id = id;
    }

    public String getId() {
        return id;
    }

    public void introduceYourself(){
        System.out.println(this.getClass().getSimpleName() + id);
    }

    public void introduceYourself(int number){

    }
}
