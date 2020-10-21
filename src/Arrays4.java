//Palindrome String
import java.util.Scanner;

public class Arrays4{
    public static void main(String[] args) {
        System.out.println("Enter the string phrase ");
        Scanner sc = new Scanner(System.in);
        String phrase = sc.nextLine();
        System.out.println("Checking if  " + phrase + " is a Palindrome ..... ");

        //build the table and the count for the each string character to check the count

        int[] table = createTable(phrase.toLowerCase());
        if(checkPalindrome(table))
            System.out.println("The String "+ phrase + " is a palindrome");
        else
            System.out.println("The String "+ phrase + " is not a palindrome");


    }

    public static boolean checkPalindrome(int[] table) {
        boolean flag = false;

        for(int count : table) {
            System.out.println("The count  "+ count);
            if(count % 2 == 1) {
                if(flag)
                    return false;
                flag = true;
            }
        }
        return true;
    }



    public static int[] createTable(String phrase) {

        int[] table = new int[getNumericValue('z') - getNumericValue('a') + 1];
        for(char c : phrase.toCharArray()) {
            if(getNumericValue(c) != -1)
                table[getNumericValue(c)] ++;
        }
        return table;

    }

    //get the numeric value for a character a -> 0, b->1 ......etc. and return -1 for unknown characters
    public static int getNumericValue(char c) {

        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int literal = Character.getNumericValue(c);
        if(literal >= a && literal <= z)
            return literal - a;
        return -1;// out of range characters

    }
}