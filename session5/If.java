package ro.siit.session5;

import java.util.ArrayList;

public class If {
    public static void main(String[] args) {
        boolean expr = true;

        if(expr) {
            System.out.println("it is true");
            System.out.println("really it is true");
        } else {
            System.out.println("It's false");
            System.out.println("It is really false");
        }

        System.out.println("continue 1");

        int a = 20;
        if(a < 14){
            System.out.println("copil");
        } else if (a < 18) {
            System.out.println("adolescent");
        } else if (a < 21){
            System.out.println("No beer for you in US");
        } else {
            System.out.println("Ia o bere!");
        }

        System.out.println("continue 2");

        System.out.println(calculateFibonacci(15));
        System.out.println(calculateFibonacci2(15));
        System.out.println(calculateFibonacci2(15));

    }

    public static int calculateFibonacci(int n){
        if(n<2) return n;
        return calculateFibonacci(n-2)+calculateFibonacci(n-1);
    }

    public static int calculateFibonacci2(int n){
        if(n<2) return n;
        int result=0;
        for(int i=1; i<n; i++){
            result+= (i==1)? 1:calculateFibonacci(i-1);
        }
        System.out.println(result);
        return result;
    }

    public static int calculateFibonacci3(int n){
        ArrayList<Integer> sequence = new ArrayList<>();
        int result = 0;
        for(int i=0; i<=n; i++){
            if(i==0||i==1) {
                sequence.add(i);
                result=i;
            }
            sequence.add(sequence.get(i-2)+sequence.get(i-1));
            result+=sequence.get(i);
        }
        System.out.println(result);
        return result;
    }

}
