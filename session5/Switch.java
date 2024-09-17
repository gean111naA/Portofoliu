package ro.siit.session5;

public class Switch {
    public static void main(String[] args) {
        int month = 9;

        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31");
                break;
            case 2:
                System.out.println("29");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30");
                break;
            default:
                System.out.println("1000");
        }
        System.out.println("continue");


        int role = 0;
        switch(role){
            case 2:
                System.out.println("X");
            case 1:
                System.out.println("W");
            case 0:
                System.out.println("R");
        }
    }

}
