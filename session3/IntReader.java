package ro.siit.session3;

import java.util.Scanner;

public class IntReader {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int sum = a + b;
        int prod = a * b;
        System.out.println(a + "+" + b + "=" + sum);
        System.out.println(a + "x" + b + "=" + prod);

        System.out.println(calculateFormula());
}

    public static double calculateFormula(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Write a decimal number: ");
        double x= scan.nextDouble();
        return Math.pow(Math.sin(x), 2)+Math.pow(Math.cos(x), 2);
    }

}