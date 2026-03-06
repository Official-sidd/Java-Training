import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringCompare {
    public static void main(String[] args) {
        // String str1 = "Hello";
        // String str2 = "Hello";
        // String str3 = new String("Hello");

        // Using '==' operator
        // System.out.println("Using '==':");
        // System.out.println("str1 == str2: " + (str1 == str2)); // true, because of string interning
        // System.out.println("str1 == str3: " + (str1 == str3)); // false, because str3 is a new object

        // Using 'equals()' method
        // System.out.println("\nUsing 'equals()':");
        // System.out.println("str1.equals(str2): " + str1.equals(str2)); // true, content is the same
        // System.out.println("str1.equals(str3): " + str1.equals(str3)); // true, content is the same
    
        Comparator<String> stringComparator = new Comparator<String>(){
            @Override
            public int compare(String s1, String s2) {
                if(s1.length() < s2.length()) {
                    return -1;
                } else if(s1.length() > s2.length()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        };
        List<String> stringList = new ArrayList<String>();
        stringList.add("Hello");
        stringList.add("Me");
        stringList.add("Java");

        Collections.sort(stringList, stringComparator);
        System.out.println(stringList);
    }    
}
