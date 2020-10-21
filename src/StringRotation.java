public class StringRotation {
    public static void main(String[] args) {
        System.out.println(" The value is " + isRotation("waterbottle", "erbottlewat"));
    }
    public static boolean isRotation(String s1, String s2) {
        if(s1.length() != s2.length()) return false;

        String duplicate = s1 + s1;
        return duplicate.contains(s2);
    }
}
