package ro.siit.session14.maps;

import ro.siit.session9.Person;

import java.util.HashMap;
import java.util.Map;

public class MainMaps {
    public static void main(String[] args) {
        Map<String, Person> persons  = new HashMap<>();

        persons.put("P1", new Person("Ion Ionescu"));
        persons.put("P2", new Person());
        persons.put("P2", new Person("George Georgescu"));

        for (String key: persons.keySet()) {
            System.out.println(persons.get(key).getFullName("ro"));
        }

        for (Map.Entry<String, Person> entry:persons.entrySet()) {
            System.out.println(entry.getValue().getFullName("en"));
        }
    }
}
