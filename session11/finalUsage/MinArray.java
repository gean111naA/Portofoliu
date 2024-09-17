package ro.siit.session11.finalUsage;

public class MinArray {

    public Integer getMin(int[] sir){
        int min = Integer.MAX_VALUE; //sir[0];
        for (int i = 0; i < sir.length ; i++) {
            if(min > sir[i]){
                min = sir[i];
            }
        }
        if (min < Integer.MAX_VALUE)
            return min;
        throw new RuntimeException("Empty array!");
    }

    public static void main(String[] args) {
        MinArray minArray = new MinArray();
        System.out.println(minArray.getMin(new int[]{1, 2, 3, 4}));
        System.out.println(minArray.getMin(new int[]{}));
    }


}
