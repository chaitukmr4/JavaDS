import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Problem2 {

    public static void main(String[] args) {
        String[] namesArray = {"Dolly", "Chay", "Jack", "Ben", "Maven", "Gradle"};
        List<String> namesList = Arrays.asList(namesArray);
        Collections.sort(namesList);
        System.out.println("The sorted list is "+ namesList);
        int index = binarySearch(namesList.toArray(namesArray), "Gradle");
        System.out.print("The Key "+ namesArray[index]);
        System.out.print(" is found at index " + index);

    }


    public static <E extends Comparable<E>> int binarySearch(E[] list, E key) {
        return binarySearch(list, key, 0, list.length-1);
    }


    public static <E extends Comparable<E>> int binarySearch(E[] list, E key, int start, int end) {
        if(start > end)
            return -1;
        else {
            int mid = (start + end)/2;
            int val = key.compareTo(list[mid]);
            if(val == 0)
                return mid;
            else  if(val < 0)
                return binarySearch(list, key, start, mid-1);
            else
                return binarySearch(list, key, mid + 1, end);
        }
    }

}
