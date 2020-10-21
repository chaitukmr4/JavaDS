import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


/*
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
 */

public class JavaFileReader {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/JavaFileReader.java");
        Scanner sc = new Scanner(file);
        String[] keywordsArray = {"abstract", "assert", "boolean", "if", "implements", "import", "instanceof",
                "int", "continue", "default", "do", "double", "else", "enum", "interface", "long", "native", "new",
                "package", "private", "extends", "for", "final", "finally", "float", "goto", "protected", "public",
                "return", "short", "static", "break", "byte", "case", "catch", "char", "class", "const", "strictfp",
                "super", "switch", "synchronized", "this", "throw", "throws", "transient", "try", "void", "volatile",
                "while", "true", "false", "null"};
        List<String> listKeywords = Arrays.asList(keywordsArray);
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        while (sc.hasNext()) {
            String line = sc.next();
            if (line.startsWith(" // ")) //check comments
                sc.nextLine();
            else if (line.contains(" \" ")) // check opening string literal
                while (sc.hasNext() && !sc.next().contains(" \" ")) {
                } //check closing string literal
            else if (line.contains(" /* ")) // check opening comment multiline
                while (sc.hasNext() && !sc.next().contains(" */ ")) {
                } //check closing comment multiline
            else if (listKeywords.contains(line)) {
                int count = treeMap.get(line) == null ? 0 : treeMap.get(line).intValue();
                treeMap.put(line, ++count);
            }
        }
        System.out.println("The list of keywords " + treeMap);
    }

    public static <E> void quickSort(E[] list, Comparable<? super E> comparator){

    }
}
