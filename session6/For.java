package ro.siit.session6;

public class For {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        int limit = Integer.parseInt(args[1]);
        // 10 .. 325
        for (int i = number, a = 3; i <= limit; i++, a++) {
            if(i % number == 0){
                System.out.println(i + " este multiplu de " + number);
            }
        }
    }
}
