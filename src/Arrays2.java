import java.util.*;
public class Arrays2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String 1");
        String value1 = sc.nextLine().trim();
        System.out.println("Enter String 2");
        String value2 = sc.nextLine().trim();

        if(checkPermutation(value1, value2))
            System.out.println("Permutation true");
        else
            System.out.println("Permutation false");
    }

    public static boolean checkPermutation(String value1, String value2) {
        return ((value1.length() == value2.length()) && (sort(value1).equals(sort(value2))));
    }

    public static String sort(String value) {
        char[] charArray = value.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
}