// Implement an algorithm to determine if a string has all unique characters. What if you
// cannot use additional data structures?
// Hints: #44, #117, #132

import java.util.Scanner;

//page 102/170
public class Arrays1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String value = sc.nextLine();
        if (Arrays1.hasUniqueCharacters(value))
            System.out.println("It has unique characters");
        else
            System.out.println("No Unique characters");
    }

    public static boolean hasUniqueCharacters(String str) {
        if(str.length() > 128)
            return false;
        boolean checkFlag[] = new boolean[128];

        for(int i =0; i< str.length(); i++) {
            char var = str.charAt(i);
            if(checkFlag[var])
                return false;
            else
                checkFlag[var] = true;
        }
        return true;
    }
}