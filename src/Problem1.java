import java.util.Arrays;

public class Problem1 {


    public static void main(String[] args) {
        Integer[] arrayIntegers = {119, 2, 3, 4, 5, 6, 119, 22};
        System.out.println("Maximum value is "+ max(arrayIntegers));
    }

    public static <E extends Comparable<E>> E max(E[] list) {
            E max = list[0];
            for(int i=1; i < list.length; i++) {
                if(list[i].compareTo(max) > 0) {
                    max = list[i];
                }
            }
            return max;
    }
}
