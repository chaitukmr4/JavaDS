public class StringCompression{
    public static void main(String[] args) {
//        String str = "aaabbcccddeff";
        String str = "abbcdddef";
        System.out.println("The length "+ str.length());
        StringBuffer newString = new StringBuffer();
        for(int i = 0;i < str.length(); ) {
            char c = str.charAt(i);
            int count = 1;
            int index = i+1;

            while(index< str.length() && c == str.charAt(index)) {
                index++;
                count ++;
                System.out.println("The character "+ c + "  count "+ count);
            }
            if(count > 1) {
                newString.append(String.valueOf(c)+(count));
//                i += count;
            }
            else
                newString.append(String.valueOf(c));
            i = index ;
            System.out.println("The compressed String is "+ newString + " the value of i is "+ index);
        }

    }
}