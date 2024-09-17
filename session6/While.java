package ro.siit.session6;

public class While {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        int limit = Integer.parseInt(args[1]);

        // while(number >= Math.min(limit, -limit) && number <= Math.max(limit, -limit)) {
        while(number >= -Math.abs(limit) && number <= Math.abs(limit)) {
            if(number == 0){
                System.out.println("Small shift 0->1");
                number = 1;
            } else if (number % 2 == 0) {
                number /= 2;
            } else {
                number *= -3;
            }
            System.out.println(number);
        }
    }
}
