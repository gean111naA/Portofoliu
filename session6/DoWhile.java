package ro.siit.session6;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String key;
        do {
            System.out.println("Hit a key ;)");
            key = keyboard.next();
            System.out.println("You hit " + key);
        } while (!key.equalsIgnoreCase("X"));

        /*
        boolean condition  = false;

        do {
            // statements
        } while (condition);

        while(condition){
            // statements
        }
        */


    }
}
