package ro.siit.session6;

/**
 * @author Filip Fiat
 */
public class IsPrime {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        boolean isPrime = true;
//        for(int i = 2, j = 1; i < Math.sqrt(number); i++, j++){
//            System.out.println("Iteration " + j);
//            if(number % i == 0){
//                isPrime = false;
//                break;
//            }
//        }

        isPrime = isPrime(number);

        System.out.println(isPrime);
    }

    /**
     * This method is a very complicated method to check if a number is prime
     * @param number The number to be checked if it is prime
     * @return true if the number is prime or false if not
     */
    public static boolean isPrime(int number) {
        int i = 2;
        boolean isPrime = true;
        while(i < Math.sqrt(number) && isPrime){
            if(number % i == 0){
                System.out.println(i);
                isPrime = false;
            }
            i++;
        }
        return isPrime;
    }
}
