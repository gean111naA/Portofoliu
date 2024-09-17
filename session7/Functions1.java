package ro.siit.session7;

import ro.siit.session6.Factorial;

public class Functions1 {
    public static void main(String[] args) {
        System.out.println(Factorial.factorial(3));
        String salutation = f1("Java passionate");
        System.out.println(salutation);
    }

    public int integerFunction(){
        return 2;
    }

    public static String sayHi(String name){
        return "Hello " + name + "!";
    }

    public static String f1(String name){
        return f2(name);
    }
    public static String f2(String name){
        return f3(name);
    }
    public static String f3(String name){
        return f4(name);
    }
    public static String f4(String name){
        return sayHi(name);
    }
}
