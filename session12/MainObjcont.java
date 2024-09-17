package ro.siit.session12;

import ro.siit.session11.innerNestedAnnonimous.Building;
import ro.siit.session11.innerNestedAnnonimous.Car;

import java.util.*;

public class MainObjcont {
    public static void main(String[] args) {

        // List objList = new ArrayList();
        ArrayList objList = new ArrayList();

        objList.add(new Car());
        objList.add(new Building());
        System.out.println(objList.get(0));
        ((Car)objList.get(0)).startEngine();
        System.out.println(objList.get(1));
        if(objList.get(1) instanceof Car) {
            ((Car) objList.get(1)).startEngine();
        }
        // System.out.println(objList.get(3));

        List<Car> cars = new ArrayList<>();
        cars.add(new Car());
        cars.get(0).startEngine();
        // cars.add(new Car.Engine("123"));

        ArrayList<String> l = new ArrayList<>();
        l.add("Ion");
        l.add("Ana");
        method(l);

        Vector<String> v = new Vector<>();
        v.addAll(l);
        method(v);

        Map<String, List<Number>> map = new HashMap<>();
    }

    public static void method(List<String> list){
        for (String entry: list) {
            System.out.println(entry);
        }
    }
}
