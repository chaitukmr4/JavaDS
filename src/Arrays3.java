import java.util.*;
public class Arrays3{

    public static void main(String[] args) {
        System.out.println("Enter the string");
        Scanner sc = new Scanner(System.in);
        String value = sc.nextLine();
        System.out.println("The replaced String is "+ replaceSpaces(value));

    }

    public static String replaceSpaces(String value) {
        //step 1: Calculate the size of the array after replacing the spaces with %20
        int length = value.trim().length();
        for(int i = 0; i < value.trim().length(); i++) {
            if(value.charAt(i) == ' ')
                length = length + 2;
        }
        char[] replacedCharArray = new char[length];
        for(int i = value.trim().length() - 1; i >= 0; i--) {
            if(value.charAt(i) == ' '){
                replacedCharArray[length - 1] = '0';
                replacedCharArray[length - 2] = '2';
                replacedCharArray[length - 3] = '%';
                length = length - 3;

            }
            else{
                replacedCharArray[length - 1] = value.charAt(i);
                length --;
            }
        }
        return new String(replacedCharArray);
    }
}