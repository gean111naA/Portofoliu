package ro.siit.session4.calc;

import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input a:");
        // double nr1 = Double.parseDouble(keyboard.nextLine());
        double nr1 = keyboard.nextDouble();
        System.out.println("Input b:");
        // double nr2 = Double.parseDouble(keyboard.nextLine());
        double nr2 = keyboard.nextDouble();
//        while (nr2 == 0){
//            System.out.println("Input b:");
//            nr2 = Double.parseDouble(keyboard.nextLine());
//        }

        System.out.println(Calculator.division(nr1, nr2));
    }
}
