import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestSingleton {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        for(int i = 1; i <=10 ; i ++) {
            values.add(i);
        }


        values.stream().filter(x -> (x%2  == 0)).forEach(System.out::print);
    }
}
