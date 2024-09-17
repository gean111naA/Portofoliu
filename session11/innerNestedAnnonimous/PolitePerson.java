package ro.siit.session11.innerNestedAnnonimous;

public class PolitePerson implements SayHiInterface{
    @Override
    public void sayHi() {
        System.out.println("Hello, how are you?");
    }

    public static void main(String[] args) {
        SayHiInterface person1 = new PolitePerson();
        person1.sayHi();

        SayHiInterface rudy = new RudePerson();
        rudy.sayHi();

        /*
        SayHiInterface yoda = new SayHiInterface(){
            @Override
            public void sayHi() {
                System.out.println("Hello, you how are!");
            }
        };
         */

        SayHiInterface yoda = () -> System.out.println("Hello, you how are!");

        yoda.sayHi();

    }
}
