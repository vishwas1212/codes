package concepts.java8.nonobjects;

import java.util.Arrays;

public class AnagramNameCheck {
    public static void main(String[] args) {
        Boolean flag = anagramCheck("ogd", "GOD");
        System.out.println(flag);
        System.out.println(anagramCheck("listen", "silent"));
        System.out.println("-----------");
        System.out.println(compareNames("  John Doe", "john doe"));  // true
        System.out.println(compareNames(" Alice", "ALICE"));  // true
        System.out.println(compareNames("Bob", "Robert"));  // false
        System.out.println(compareNames("Mary Jane", "Mary  Jane"));  // true (extra space removed)
        System.out.println(compareNames(null, null));  // true
    }

    private static boolean compareNames(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return str1 == str2;
        }
        String name1 = str1.trim().toLowerCase().replaceAll("\\s+", " ");
        String name2 = str2.trim().toLowerCase().replaceAll("\\s+", " ");

        return name1.equals(name2);
    }

    private static Boolean anagramCheck(String str1, String str2) {

        if (str1 == null || str2 == null || str1.length() != str2.length()) {
            return false;
        } else {
            char[] charArray1 = str1.toLowerCase().toCharArray();
            char[] charArray2 = str2.toLowerCase().toCharArray();
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);
            return Arrays.equals(charArray1, charArray2);
        }
    }
}
