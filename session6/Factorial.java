package ro.siit.session6;

public class Factorial {
    public static void main(String[] args) {
        long start = System.nanoTime();
        System.out.println(factorial(5));
        long intermediate = System.nanoTime();
        System.out.println(factorialIterativ(5));
        long end = System.nanoTime();

        System.out.println(intermediate - start);
        System.out.println(end - intermediate);
    }

    public static int factorial(int number){
        if(number == 1 || number == 0) {
            return 1;
        }
        return number  * factorial(number - 1);
    }

    public static int factorialIterativ(int number){
        if(number == 1 || number == 0) {
            return 1;
        }
        int factorial = 1;
        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
